import React from 'react';
import Dialog from './Dialog';

export default function CustomDialog(props) {
  return (
    <Dialog>
      <h1>{props.title}</h1>
      <h3>{props.description}</h3>
    </Dialog>
  );
}
