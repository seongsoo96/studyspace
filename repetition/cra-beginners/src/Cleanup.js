import { useState, useEffect } from "react";

function Hello() {
	// const destroyedFn = () => {
	// 	console.log("bye :(");
	// };
	// const createdFn = () => {
	// 	console.log("created :)");
	// 	return destroyedFn;
	// };
	useEffect(() => {
		console.log("hi :)");
		return () => console.log("by :(");
	}, []);
	return <h1>Hello</h1>;
}

function Cleanup() {
	const [showing, setShowing] = useState(false);
	const onClick = () => setShowing((prev) => !prev);
	return (
		<div>
			<button onClick={onClick}>{showing ? "Hide" : "Show"}</button>
			{showing ? <Hello /> : null}
		</div>
	);
}

export default Cleanup;
