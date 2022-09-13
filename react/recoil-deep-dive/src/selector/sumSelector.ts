import numAState from '../store/atom/numAState';
import numBState from '../store/atom/numBState';
import { selector } from '../recoilClone';

const sumSelector = selector({
  key: 'sumSelector', // unique ID (with respect to other atoms/selectors)
  get: ({ get }) => {
    const a = get(numAState);
    const b = get(numBState);

    return a + b;
  },
});

export default sumSelector;
