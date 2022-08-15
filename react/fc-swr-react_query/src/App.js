import { QueryClient, QueryClientProvider } from '@tanstack/react-query';
import { ReactQueryDevtools } from '@tanstack/react-query-devtools';

import './App.css';
import InfiniteScroll from './components/ReactQueryExample/InfiniteScroll';
// import Example from './components/ReactQueryExample/Example';
// import Pagenation from './components/ReactQueryExample/Pagenation';
// import QuickStart from './components/ReactQueryExample/QuickStart';
// import Cache from './components/SWR-Example/Cache';
// import Fetcher from './components/SWR-Example/Fetcher';
// import Mutate from './components/SWR-Example/Mutate';
// import Pagenation from './components/SWR-Example/Pagenation';
// import Profile from './components/SWR-Example/Profile';
// import TestMocking from './components/TestMocking';
const queryClient = new QueryClient();

function App() {
  return (
    <div className="App">
      {/* <TestMocking /> */}
      {/* <Profile /> */}
      {/* <Cache /> */}
      {/* <Fetcher /> */}
      {/* <Mutate /> */}
      {/* <Pagenation /> */}
      <QueryClientProvider client={queryClient}>
        {/* <Example /> */}
        {/* <QuickStart /> */}
        {/* <Pagenation /> */}
        <InfiniteScroll />
        <ReactQueryDevtools />
      </QueryClientProvider>
    </div>
  );
}

export default App;
