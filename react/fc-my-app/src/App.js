import './App.css';
import Composition from './components/2-4.Props/Composition';
import Extraction from './components/2-4.Props/Extraction/Extraction';
import ClassComponent from './components/2-5.State/ClassComponent';
import ClassComponent2 from './components/2-6.LifeCycle/ClassComponent';
import FunctionalComponent from './components/2-5.State/FunctionalComponent';
import Event from './components/2-7.Event/Event';
import Condition from './components/2-8.ConditionalRendering/Condition';
import List from './components/2-9.List/List';
import ControlledComponent from './components/2-10.Form/ControlledComponent';
import UncontrolledComponent from './components/2-10.Form/UncontrolledComponent';
import State from './components/3-3.Hooks/State';
import Reducer from './components/3-3.Hooks/Reducer';

function App() {
  return (
    <div className="App">
      <Reducer />
      <State />
      {/* <UncontrolledComponent /> */}
      {/* <ControlledComponent /> */}
      {/* <List /> */}
      {/* <Condition /> */}
      {/* <Event /> */}
      {/* <ClassComponent2 /> */}
      {/* <FunctionalComponent /> */}
      {/* <ClassComponent /> */}
      {/* <Composition /> */}
      {/* <Extraction /> */}
    </div>
  );
}

export default App;
