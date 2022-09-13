import { useCoiledValue } from '../recoilClone';
import numAState from '../store/atom/numAState';
import numBState from '../store/atom/numBState';
import sumSelector from '../store/selector/sumSelector';

export default function ShowSum() {
  const sumValue = useCoiledValue(sumSelector);
  const numA = useCoiledValue(numAState);
  const numB = useCoiledValue(numBState);

  return (
    <>
      <div>SumNum Component</div>
      <div>SumValue = NumA + NumBx2 : {sumValue}</div>
      <div>NumA : {numA}</div>
      <div>NumB : {numB}</div>
    </>
  );
}
