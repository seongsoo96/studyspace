import React from 'react';
import { useCoiledValue } from '../recoilClone';
import sumSelector from '../selector/sumSelector';

export default function ShowSum() {
  const sumValue = useCoiledValue(sumSelector);

  return (
    <>
      <div>SumNum</div>
      <div>{sumValue}</div>
    </>
  );
}
