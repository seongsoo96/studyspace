import { useMutation, useQuery, useQueryClient } from '@tanstack/react-query';
import React from 'react';
import GlobalLoader from './GlobalLoader';
import { getTodos, postTodo } from './my-api';

export default function QuickStart() {
  const queryClient = useQueryClient();

  const query = useQuery(['todos'], getTodos);

  const mutation = useMutation(postTodo, {
    onSuccess: () => {
      queryClient.invalidateQueries('todos');
    },
  });
  if (query.isLoading) {
    return '퀵스타트 로딩중...';
  }

  if (query.error) {
    return '퀵스타트 에러...';
  }

  return (
    <div>
      <GlobalLoader />
      {query.isFetching ? <div>Refresh</div> : null}
      <ul>
        {query.data.map((todo) => (
          <li key={todo.id}>{todo.title}</li>
        ))}
      </ul>
      <button
        onClick={() => {
          mutation.mutate({
            id: Date.now(),
            title: 'Learn React-Query',
          });
        }}>
        Add Todo
      </button>
    </div>
  );
}
