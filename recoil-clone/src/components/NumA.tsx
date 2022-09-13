import React from 'react';
import { useCoiledState } from '../recoilClone';
import numAState from '../store/atom/numAState';

export default function NumA() {
  const [numA, setNumA] = useCoiledState(numAState);
  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setNumA(+e.target.value);
  };
  return (
    <>
      <span>Number A Change : </span>
      <input type="number" onChange={handleChange} />
      <div>NumA Component : {numA}</div>
    </>
  );
}
