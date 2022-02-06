import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import TodoList from './TodoList';

ReactDOM.render(
  <React.StrictMode>
    {/* <App /> */}
    <TodoList />
  </React.StrictMode>,
  document.getElementById('root')
);