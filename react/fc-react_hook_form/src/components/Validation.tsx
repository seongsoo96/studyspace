import React, { useState } from 'react';
import { useForm } from 'react-hook-form';
import '../styles.css';

interface Form {
  age: number;
}

function Validation() {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm<Form>();
  const [result, setResult] = useState<string>();

  const onSubmit = (data: Form) => {
    setResult(JSON.stringify(data));
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input
        type="number"
        placeholder="Age"
        {...register('age', { required: true, min: 17, max: 40 })}
      />
      {errors.age?.type === 'required' && (
        <span className="error">Age is required</span>
      )}
      {errors.age?.type === 'min' && (
        <span className="error">Minimum Age is 17</span>
      )}
      {errors.age?.type === 'max' && (
        <span className="error">Maximum Age is 40</span>
      )}
      <input type="submit" />
      <p style={{ color: '#000' }}>{result}</p>
    </form>
  );
}

export default Validation;
