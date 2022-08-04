import './App.css';
import { observableTodoStore } from './app/ObservableTodoStore';
// import MobxExample from './components/MobxExample';
import TodoList from './components/TodoList';
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
      <TodoList store={observableTodoStore} />
    </div>
  );
}

export default App;
