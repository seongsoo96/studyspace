import React from 'react';
import Dialog from './Dialog';

export default function ThankyouDialog() {
  return (
    <Dialog
      title={<button style={{ color: 'purple' }}>Thanks</button>}
      description="It is honor to meet you!"
      button={
        <button style={{ backgroundColor: 'blue', color: 'white' }}>Bye</button>
      }
    />
  );
}
