/** @jsxImportSource @emotion/react */
import { css } from '@emotion/react';
import styled from '@emotion/styled';

const Button = styled.button`
  padding: 32px;
  background-color: hotpink;
  font-size: 24px;
  border-radius: 4px;
  color: black;
  font-weight: bold;
  &:hover {
    color: white;
  }
`;

const color = 'white';

const style = css`
  color: hotpink;
`;

const SomeComponent = ({ children }) => (
  <div css={style}>
    Some hotpink text.
    {children}
  </div>
);

const anotherStyle = css({
  textDecoration: 'underline',
});

const AnotherComponent = () => (
  <div css={anotherStyle}>Some text with an underline.</div>
);

const P = (props) => (
  <p
    css={{
      margin: 0,
      fontSize: 12,
      lineHeight: '1.5',
      fontFamily: 'Sans-Serif',
      color: 'black',
    }}
    {...props} // <- props contains the `className` prop
  />
);

const ArticleText = (props) => (
  <P
    css={{
      fontSize: 14,
      fontFamily: 'Georgia, serif',
      color: 'darkgray',
    }}
    {...props} // <- props contains the `className` prop
  />
);

const danger = css`
  color: red;
`;

const base = css`
  background-color: darkgreen;
  color: turquoise;
`;

export default function EmotionExample() {
  return (
    <>
      <div
        css={css`
          padding: 32px;
          background-color: hotpink;
          font-size: 24px;
          border-radius: 4px;
          &:hover {
            color: ${color};
          }
        `}>
        Hover to change color.
      </div>
      <Button>Hello</Button>
      <SomeComponent>
        <AnotherComponent />
      </SomeComponent>
      <P>pppp</P>
      <ArticleText>pppp</ArticleText>
      <div css={base}>This will be turquoise</div>
      <div css={[danger, base]}>
        This will be also be turquoise since the base styles overwrite the
        danger styles.
      </div>
      <div css={[base, danger]}>This will be red</div>
    </>
  );
}
