import Button from "./Button";
import styles from "./App.module.css";
import {useState, useEffect} from "react";

function App() {
  const [counter, setValue] = useState(0);
  const [keyword, setKeyword] = useState("");
  const onClick = () => setValue((prev) => prev + 1);
  const onChange = (e) => setKeyword(e.target.value);
  // console.log("I run all the time");
  useEffect(() => {
    console.log("I run only once.")
  }, []);
  useEffect(() => {
    console.log("I run when 'keyword' changes.")
  }, [keyword]);
  useEffect(() => {
    console.log("I run when 'counter' changes.")
  }, [counter]);
  useEffect(() => {
    console.log("I run when 'keyword' & 'counter' changes.")
  }, [counter, keyword]);
  return (
    <div>
      <input 
        value={keyword} 
        onChange={onChange} 
        type="text" 
        placeholder="Search here..." 
      />
      <h1 className={styles.title}>{counter}</h1>
      <button onClick={onClick}>click me</button>
      <Button text={"Continue"} />
    </div>
  );
}

export default App;
