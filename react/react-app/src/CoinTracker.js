import { useState, useEffect } from "react";

function CoinTracker() {
	const [loading, setLoading] = useState(true);
	const [coins, setCoins] = useState([]);
	const [cost, setCost] = useState(1);
	const [money, setMoney] = useState(1);
	const onChange = (event) => {
		setCost(event.target.value);
		setMoney(0);
	};
	const handleInput = (e) => {
		setMoney(e.target.value);
	};
	useEffect(() => {
		fetch("https://api.coinpaprika.com/v1/tickers")
			.then((res) => res.json())
			.then((json) => {
				setCoins(json);
				setLoading(false);
			});
	}, []);
	return (
		<div>
			<h1>
				The coins!{loading ? "" : `Here are... ${coins.length} coins`}
			</h1>
			{loading ? (
				<strong>loading...</strong>
			) : (
				<select onChange={onChange}>
					<option>Select Coin!</option>
					{coins.map((coin, index) => (
						<option
							type="number"
							value={coin.quotes.USD.price}
							id={coin.symbol}
							symbol={coin.symbol}
						>
							{coin.name}({coin.symbol} : ${" "}
							{coin.quotes.USD.price} USD)
						</option>
					))}
				</select>
			)}
			<h2>Please enter the amount</h2>
			<div>
				<input
					type="number"
					value={money}
					onChange={handleInput}
					placeholder="dollor"
				/>
				$
			</div>
			<h2>You can get {money / cost}</h2>
		</div>
	);
}

export default CoinTracker;
