import { RecoilRoot } from 'recoil';
import './App.css';
import CurrentUserInfo from './components/RecoilExample/CurrentUserInfo';
import TodoList from './components/RecoilExample/Todo/TodoList';
// import { observableTodoStore } from './app/ObservableTodoStore';
// import { CharacterCounter } from './components/RecoilExample/CharacterCounter';
// import FontButton from './components/RecoilExample/FontButton';
// import Text from './components/RecoilExample/Text';
// import MobxExample from './components/MobxExample';
// import TestMocking from './components/TestMocking';
// import Counter from './features/counter/Counter';
// import Counter2 from './components/Counter2';

function App() {
  return (
    <div className="App">
      {/* <TestMocking />
      <Counter />
      <br />
      <br />
      <br /> */}
      {/* <Counter2 /> */}
      {/* <MobxExample /> */}
      {/* <TodoList store={observableTodoStore} /> */}
      <RecoilRoot>
        {/* <FontButton />
        <Text />
        <CharacterCounter /> */}
        <TodoList />
        <CurrentUserInfo />
      </RecoilRoot>
    </div>
  );
}

export default App;
