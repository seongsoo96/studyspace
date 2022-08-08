import React from 'react';
import create from 'zustand';

const useStore = create((set) => ({
  textState: '',
  setTextState: (text) => set(() => ({ textState: text })),
}));

export function CharacterCounter() {
  return (
    <div>
      <TextInput />
      <CharacterCount />
    </div>
  );
}

function TextInput() {
  const [text, setText] = useStore((state) => [
    state.textState,
    state.setTextState,
  ]);

  const onChange = (event) => {
    setText(event.target.value);
  };

  return (
    <div>
      <input type="text" value={text} onChange={onChange} />
      <br />
      Echo: {text}
    </div>
  );
}

function CharacterCount() {
  const count = useStore((state) => state.textState.length);

  return <>Character Count: {count}</>;
}
