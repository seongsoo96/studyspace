import { atom } from '../../recoilClone';

const numAState = atom({
  key: 'numberA',
  default: 0,
});

export default numAState;
