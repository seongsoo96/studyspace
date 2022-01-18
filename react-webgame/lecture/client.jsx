const React = require('react');
const ReactDom = require('react-dom');

// const WordRelay = require('./WordRelay.jsx')
const WordRelay = require('./WordRelayHooks.jsx')

ReactDom.render(<WordRelay />, document.querySelector('#root'));