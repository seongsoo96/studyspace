import { selector } from '../../recoilClone';
import numAState from '../atom/numAState';
import numBState from '../atom/numBState';

const sumSelector = selector({
  key: 'sumSelector', // unique ID (with respect to other atoms/selectors)
  get: ({ get }) => {
    const a = get(numAState);
    const b = get(numBState);

    return a + b * 2;
  },
});

export default sumSelector;
