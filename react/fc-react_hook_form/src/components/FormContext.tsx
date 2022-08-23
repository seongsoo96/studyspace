import '../styles.css';

import React, { useState } from 'react';
import { useForm, FormProvider, useFormContext } from 'react-hook-form';

function NestedInput() {
  const { register } = useFormContext();

  return <input placeholder="User Name" {...register('name')} />;
}

interface Form {
  name: string;
}

function FormContext() {
  const methods = useForm<Form>();
  const [result, setResult] = useState('');

  const onSubmit = (data: Form) => {
    setResult(JSON.stringify(data));
  };

  return (
    <FormProvider {...methods}>
      <form onSubmit={methods.handleSubmit(onSubmit)}>
        <NestedInput />
        <input type="submit" />
        <p>{result}</p>
      </form>
    </FormProvider>
  );
}

export default FormContext;
