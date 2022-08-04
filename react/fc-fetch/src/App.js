import logo from './logo.svg';
import './App.css';
import TestMocking from './components/TestMocking';
import Counter from './features/counter/Counter';
import Counter2 from './components/Counter2';

function App() {
  return (
    <div className="App">
      <TestMocking />
      <Counter />
      <br />
      <br />
      <br />
      <Counter2 />
    </div>
  );
}

export default App;
