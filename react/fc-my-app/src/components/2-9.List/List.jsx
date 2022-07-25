import React from 'react';

export default function List() {
  const numbers = [1, 2, 3, 4, 5];
  //   return (
  //     <ul>
  //       {numbers.map((item) => (
  //         <li key={item.toString()}></li>
  //       ))}
  //     </ul>
  //   );
  const todos = [
    { id: 1, text: 'Drink Water' },
    { id: 2, text: 'Wash Car' },
    { id: 3, text: 'Listen Lecture' },
    { id: 4, text: 'Go to bed' },
  ];

  const Item = (props) => {
    return (
      <li>
        {props.id}
        {props.text}
      </li>
    );
  };

  const todoList = todos.map((todo) => (
    <Item key={todo.id} {...todo} id={todo.id} text={todo.text} />
  ));

  return <>{todoList}</>;
}
