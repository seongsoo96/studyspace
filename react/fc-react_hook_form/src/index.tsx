import React from 'react';
import ReactDOM from 'react-dom/client';
import Register from './components/Register';
import reportWebVitals from './reportWebVitals';
import Watch from './components/Watch';
import Validation from './components/Validation';
import FormContext from './components/FormContext';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <h1>Register</h1>
    <Register />
    <h1>Watch</h1>
    <Watch />
    <h1>Validation</h1>
    <Validation />
    <h1>FormContext</h1>
    <FormContext />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
