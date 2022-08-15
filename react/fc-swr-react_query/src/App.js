import './App.css';
import Cache from './components/SWR-Example/Cache';
import Fetcher from './components/SWR-Example/Fetcher';
import Mutate from './components/SWR-Example/Mutate';
import Pagenation from './components/SWR-Example/Pagenation';
import Profile from './components/SWR-Example/Profile';
import TestMocking from './components/TestMocking';

function App() {
  return (
    <div className="App">
      {/* <TestMocking /> */}
      {/* <Profile /> */}
      {/* <Cache /> */}
      {/* <Fetcher /> */}
      <Mutate />
      <Pagenation />
    </div>
  );
}

export default App;
