import React from 'react';
import withLoading from './withLoading';

function Input() {
  return <input defaultValue="Input" />;
}

export default withLoading(Input);
