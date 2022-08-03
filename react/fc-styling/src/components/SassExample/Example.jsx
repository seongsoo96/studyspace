import React from 'react';
import './Example.scss';

export default function Example() {
  return (
    <div>
      <p>Example</p>
      <p className="font">Example</p>
      <nav>
        <ul>
          <li>123</li>
          <li>
            <a>456</a>
          </li>
        </ul>
      </nav>
      <ul>
        <li>123</li>
        <li>
          <a>456</a>
        </li>
      </ul>
      <p className="base">Hello</p>
      <p className="inverse">Hello</p>
      <p className="info">Hello</p>
      <p className="alert">Hello</p>
      <p className="success">success</p>
      <p className="message">message</p>
      <p className="success2">success2</p>
      <p className="error">error</p>
      <p className="warning">warning</p>
      <div className="square-av"></div>
      <div className="circle-av"></div>
      <div className="sidebar"></div>
      <div className="gray">Gray</div>
      <div className="button">Button</div>
    </div>
  );
}
