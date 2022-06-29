import React from 'react';
import ReactDOM from 'react-dom/client';
import Todo from './Todo';
import UseEffect from './UseEffect';
import Cleanup from './Cleanup';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // <React.StrictMode>
  <>
    <Todo />
  </>
  // </React.StrictMode>
);
