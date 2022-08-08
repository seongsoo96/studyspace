import React from 'react';
// import { useRecoilValue } from 'recoil';
import TodoItem from './TodoItem';
import TodoListCreator from './TodoListCreator';
import TodoListFilters from './TodoListFilters';
import TodoListStats from './TodoListStats';
// import TodoListCreator from './TodoListCreator';
// import TodoListFilters from './TodoListFilters';
// import TodoListStats from './TodoListStats';
import { useStore } from './TodoStore';

export default function TodoList() {
  const todoList = useStore((state) => state.filteredTodoListState());

  return (
    <>
      <TodoListStats />
      <TodoListFilters />
      <TodoListCreator />

      {todoList.map((todoItem) => (
        <TodoItem key={todoItem.id} item={todoItem} />
      ))}
    </>
  );
}
