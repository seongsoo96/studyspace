import React from 'react';
import { useCoiledState } from '../recoilClone';
import numBState from '../store/atom/numBState';

export default function NumB() {
  const [numB, setNumB] = useCoiledState(numBState);
  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setNumB(+e.target.value);
  };
  return (
    <>
      <span>Number B Change : </span>
      <input type="number" onChange={handleChange} />
      <div>NumB Component : {numB}</div>
    </>
  );
}
