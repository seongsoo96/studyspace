import React from 'react';
import axios from 'axios';
import create from 'zustand';

const useStore = create((set) => ({
  id: 2,
  setId: (id) => set({ id: id }),
  userName: 'jimmy',
  fetchUserName: async (id) => {
    const response = await axios.get(`/api/user-name?id=${id}`);
    set({ userName: response.data.name });
  },
}));

function CurrentUser() {
  const userName = useStore((state) => state.userName);
  return <div>{userName}</div>;
}

export default function CurrentUserInfo() {
  const fetchUserName = useStore((state) => state.fetchUserName);

  return (
    <>
      <CurrentUser />
      <input onChange={(e) => fetchUserName(e.target.value)} />
    </>
  );
}
