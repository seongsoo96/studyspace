import './styles.css';

import React, { useState } from 'react';
import { useForm } from 'react-hook-form';

interface Form {
  name: string;
  password: string;
}

function Register() {
  const { register, handleSubmit } = useForm<Form>();
  const [result, setResult] = useState('');

  const onSubmit = (data: Form) => setResult(JSON.stringify(data));

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input type="text" {...register('name')} placeholder="User Name" />
      <input type="password" {...register('password')} placeholder="Password" />
      <input type="submit" />
      <p>{result}</p>
    </form>
  );
}

export default Register;
