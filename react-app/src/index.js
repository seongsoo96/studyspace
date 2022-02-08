import React from "react";
import ReactDOM from "react-dom";
import App from "./App";
import TodoList from "./TodoList";
import CoinTracker from "./CoinTracker";

ReactDOM.render(
	<React.StrictMode>
		{/* <App /> */}
		{/* <TodoList /> */}
		<CoinTracker />
	</React.StrictMode>,
	document.getElementById("root")
);
