import { useState, useEffect, useCallback } from 'react';

// disconnect 함수를 가지고 있는 interface이다.
// 함수로도 충분하지만 object 형식이 더 가독성이 좋아보여서 interface로 작성한다.
interface Disconnect {
  disconnect: () => void;
}

// 'Stateful'은 states와 subscriptions를 관리하는 기본 class이다.
// Atom과 Selector 둘다 Stateful로부터 파생된다.

export class Stateful<T> {
  // 유일의 key값이 존재해야하므로 Set 객체 선언.
  // 어떤 상태가 바뀌는지 감지하기 위한 callback이다.
  private listeners = new Set<(value: T) => void>();

  constructor(protected value: T) {}

  // 상태를 반환하는 단순한 method.
  snapshot(): T {
    return this.value;
  }

  // 모든 listners에게 상태 변경 감지를 알리는 method.
  private emit() {
    for (const listener of Array.from(this.listeners)) {
      listener(this.snapshot());
    }
  }

  // 상태를 변경하는 method.
  protected update(value: T) {
    // 불필요한 렌더링을 방지하기 위해 동치 비교한다
    if (this.value !== value) {
      this.value = value;
      // value값을 update 한 후, listners에게 상태 변화가 있음을 알려준다.
      this.emit();
    }
  }

  // The subscribe method lets consumers listen for state updates. Calling
  // the `disconnect` method will stop the callback from being called in
  // the future.
  subscribe(callback: (value: T) => void): Disconnect {
    this.listeners.add(callback);
    return {
      disconnect: () => {
        this.listeners.delete(callback);
      },
    };
  }
}

export class Atom<T> extends Stateful<T> {
  public setState(value: T) {
    super.update(value);
  }
}

// get함수를 통해 다른 selector나 atom을 구독할 수 있다.
type SelectorGenerator<T> = (context: { get: <V>(dep: Stateful<V>) => V }) => T;

export class Selector<T> extends Stateful<T> {
  // 등록된 deps들을 계속 추적해야한다.
  private registeredDeps = new Set<Stateful<any>>();

  // When the get function is called, it allows consumers to subscribe to state
  // changes. This method subscribes to the dependency if it hasn't been already,
  // then returns it's value.
  private addDep<V>(dep: Stateful<V>): V {
    if (!this.registeredDeps.has(dep)) {
      dep.subscribe(() => this.updateSelector());
      this.registeredDeps.add(dep);
    }

    return dep.snapshot();
  }

  // A helper method for running the internal generator method, updating dependencies,
  // returning the computed state and updating all listeners.
  private updateSelector() {
    this.update(this.generate({ get: (dep) => this.addDep(dep) }));
  }

  constructor(private readonly generate: SelectorGenerator<T>) {
    // This needs to be undefined initially because of Typescript's inheritance rules
    // It's effectively "initialised memory"
    super(undefined as any);
    this.value = generate({ get: (dep) => this.addDep(dep) });
  }
}

// A helper function for creating a new Atom
// The `key` member is currently unused. I just kept it around to maintain a similar
// API to Recoil.
export function atom<V>(value: { key: string; default: V }): Atom<V> {
  return new Atom(value.default);
}

// A helper method for creating a new Selector
// Likewise the `key` method is just for looking like Recoil.
export function selector<V>(value: {
  key: string;
  get: SelectorGenerator<V>;
}): Selector<V> {
  return new Selector(value.get);
}

// This hook will re-render whenever the supplied `Stateful` value changes.
// It can be used with `Selector`s or `Atom`s.
export function useCoiledValue<T>(value: Stateful<T>): T {
  const [, updateState] = useState({});

  useEffect(() => {
    const { disconnect } = value.subscribe(() => updateState({}));
    return () => disconnect();
  }, [value]);

  return value.snapshot();
}

// Similar to the above method, but it also lets you set state.
export function useCoiledState<T>(atom: Atom<T>): [T, (value: T) => void] {
  const value = useCoiledValue(atom);
  return [value, useCallback((value) => atom.setState(value), [atom])];
}
