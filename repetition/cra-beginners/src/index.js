import React from 'react';
import ReactDOM from 'react-dom/client';
import Todo from './Todo';
import UseEffect from './UseEffect';
import Cleanup from './Cleanup';
import CoinTracker from './CoinTracker';
import MovieApp from './MovieApp';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // <React.StrictMode>
  <>
    <MovieApp />
  </>
  // </React.StrictMode>
);
