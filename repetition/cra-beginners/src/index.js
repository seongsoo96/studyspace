import React from "react";
import ReactDOM from "react-dom/client";
import UseEffect from "./UseEffect";
import Cleanup from "./Cleanup";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
	// <React.StrictMode>
	<>
		<UseEffect />
		<Cleanup />
	</>
	// </React.StrictMode>
);
