import React from 'react';
import { createPortal } from 'react-dom';
import ThankyouDialog from '../3-11.Portal/ThankyouDialog';

const Portal = (props) => {
  return createPortal(props.children, document.getElementById('portal'));
};

export default function Example() {
  return (
    <div onClick={() => console.log('div')}>
      <Portal>
        <ThankyouDialog />
      </Portal>
      <div style={{ position: 'absolute' }}>
        <button>하하하</button>
      </div>
    </div>
  );
}
