import { useState, useEffect } from "react";

function TodoList() {
	const [toDo, setTodo] = useState("");
	const [toDos, setToDos] = useState([]);
	const onChange = (e) => setTodo(e.target.value);
	const onSubmit = (e) => {
		e.preventDefault();
		if (toDo === "") {
			return;
		}
		setTodo("");
		setToDos((currentArray) => [toDo, ...currentArray]);
	};
	console.log(toDos);
	return (
		<div>
			<h1>My To Dos ({toDos.length})</h1>
			<form onSubmit={onSubmit}>
				<input
					value={toDo}
					onChange={onChange}
					type="text"
					placeholder="Write your to do..."
				/>
				<button>Add To Do</button>
			</form>
			<hr />
			<ul>
				{toDos.map((item, index) => (
					<li key={index}>{item}</li>
				))}
			</ul>
		</div>
	);
}

export default TodoList;
