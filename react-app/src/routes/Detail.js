import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

function Detail() {
	const { id } = useParams();
	const [movie, setMovie] = useState({});
	const getMovie = async () => {
		const json = await (
			await fetch(
				`https://yts.mx/api/v2/movie_details.json?movie_id=${id}`
			)
		).json();
		console.log(json.data.movie);
		setMovie(json.data.movie);
	};
	useEffect(() => {
		getMovie();
	}, []);
	console.log();
	return (
		<>
			<div>
				<img src={movie.background_image_original} />
			</div>
			<div>
				<img src={movie.small_cover_image} />
			</div>
			<li>{movie.title_long}</li>
			<li>{movie.rating}</li>
			<li>{movie.runtime}min</li>
			<li>Genres</li>
			<div>
				<ul>{movie.genres && movie.genres.map((g) => <li>{g}</li>)}</ul>
			</div>
		</>
	);
}
export default Detail;
