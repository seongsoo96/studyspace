import React from 'react';
import '../styles.css';
import { useForm } from 'react-hook-form';

function Watch() {
  const { register, watch } = useForm();

  const watchNickname = watch('nickname', 'Easton');

  return (
    <form>
      <input type="text" placeholder="User Name" {...register('nickname')} />
      <input type="password" placeholder="Password" {...register('password')} />
      <p style={{ color: '#000' }}>{watchNickname}</p>
    </form>
  );
}

export default Watch;
