import { useState, useEffect } from "react";

function CoinTracker() {
	const [loading, setLoading] = useState(true);
	const [coins, setCoins] = useState([]);
	const [money, setMoney] = useState(0);
	useEffect(() => {
		fetch("https://api.coinpaprika.com/v1/tickers")
			.then((res) => res.json())
			.then((json) => {
				setCoins(json);
				setLoading(false);
			});
	}, []);
	// const onChange = (e) => {
	// 	setMoney(e.target.value);
	// 	console.log(e.target.value);
	// };
	// const onSubmit = (e) => {
	// 	e.preventDefault();
	// 	console.log(e);
	// };
	return (
		<div>
			<h1>The Coins! ({coins.length}) </h1>
			{loading ? (
				<strong>Loading...</strong>
			) : (
				<select>
					{coins.map((coin) => (
						<option>
							{coin.name} ({coin.symbol}): $
							{coin.quotes.USD.price}USD
						</option>
					))}
				</select>
				{
					<form onSubmit={onSubmit}>
					<input type="text" value={money} onChange={onChange} />
					<button>변환</button>
				</form> 
			}
			)}
		</div>
	);
}

export default CoinTracker;

// import { useState } from "react";
// import { useEffect } from "react/cjs/react.development";

// function CoinTracker() {
// 	const [loading, setLoading] = useState(true);
// 	const [coins, setCoins] = useState([]);
// 	const [cost, setCost] = useState(1);
// 	const [need, setNeed] = useState(1);
// 	const onChange = (event) => {
// 		setCost(event.target.value);
// 		setNeed(1);
// 	};
// 	const handleInput = (event) => {
// 		setNeed(event.target.value);
// 	};
// 	useEffect(() => {
// 		fetch("https://api.coinpaprika.com/v1/tickers")
// 			.then((response) => response.json())
// 			.then((json) => {
// 				setCoins(json);
// 				setLoading(false);
// 			});
// 	}, []);
// 	return (
// 		<div>
// 			<h1>
// 				The coins!{loading ? "" : `Here are..${coins.length} coins`}
// 			</h1>
// 			{loading ? (
// 				<strong>loading...</strong>
// 			) : (
// 				<select onChange={onChange}>
// 					<option>Select Coin!</option>
// 					{coins.map((coin, index) => (
// 						<option
// 							key={index}
// 							value={coin.quotes.USD.price}
// 							id={coin.symbol}
// 							symbol={coin.symbol}
// 						>
// 							{coin.name}({coin.symbol}) : $
// 							{coin.quotes.USD.price} USD
// 						</option>
// 					))}
// 				</select>
// 			)}
// 			<h2>Please enter the amount</h2>
// 			<div>
// 				<input
// 					type="number"
// 					value={need}
// 					onChange={handleInput}
// 					placeholder="dollor"
// 				/>
// 				$
// 			</div>
// 			<h2>You can get {need / cost}</h2>
// 		</div>
// 	);
// }
// export default CoinTracker;
