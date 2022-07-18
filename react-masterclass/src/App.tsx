import React, { useState } from 'react';
import styled from 'styled-components';
import Circle from './Circle';

const Container = styled.div`
  background-color: ${(props) => props.theme.bgColor};
`;
const H1 = styled.h1`
  color: ${(props) => props.theme.textColor};
`;

function App() {
  return (
    <Container>
      <H1>protected</H1>
    </Container>
  );
}

// function App() {
//   const [value, setValue] = useState('');
//   const onChange = (event: React.FormEvent<HTMLInputElement>) => {
//     const {
//       currentTarget: { value },
//     } = event;
//     setValue(value);
//   };
//   const onSubmit = (event: React.FormEvent<HTMLFormElement>) => {
//     event.preventDefault();
//     console.log('hello', value);
//   };

//   return (
//     <div>
//       {/* <Circle borderColor="yellow" bgColor="teal" />
//       <Circle bgColor="tomato" /> */}
//       <form onSubmit={onSubmit}>
//         <input
//           onChange={onChange}
//           value={value}
//           type="text"
//           placeholder="username"
//         />
//         <button>Log in</button>
//       </form>
//     </div>
//   );
// }

export default App;
