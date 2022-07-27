import React from 'react';

export default function Event() {
  const handleButtonClick = (e) => {
    // console.dir(e);
    console.log('handleButtonClick');
  };

  const handleClickCapture = () => {
    console.log('handleClickCapture');
  };

  const handleClickCapture2 = () => {
    console.log('handleClickCapture2');
  };

  const handleClickBubble = () => {
    console.log('handleClickBubble');
  };

  return (
    <div onClickCapture={handleClickCapture}>
      <div onClickCapture={handleClickCapture2} onClick={handleClickBubble}>
        <button onClick={handleButtonClick}>Button</button>
      </div>
    </div>
  );
}
