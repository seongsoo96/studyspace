import React, { useReducer, useState } from 'react';

export default function Reducer() {
  const initialState = { count: 0, name: 'apple' };

  function reducer(state, action) {
    switch (action.type) {
      case 'reset':
        return initialState;
      case 'increment':
        return { count: state.count + 1, name: 'banana' };
      case 'decrement':
        return { count: state.count - 1, name: 'car' };
      default:
        throw new Error();
    }
  }

  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <div>
      Count(Reducer): {state.count}
      Name: {state.name}
      <button onClick={() => dispatch({ type: 'reset' })}>Reset</button>
      <button onClick={() => dispatch({ type: 'decrement' })}>-</button>
      <button onClick={() => dispatch({ type: 'increment' })}>+</button>
    </div>
  );
}
