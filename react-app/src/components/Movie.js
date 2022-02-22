import PropType from "prop-types";
import { Link } from "react-router-dom";

function Movie({ id, coverImg, title, summary, genres }) {
	return (
		<div>
			<div>
				<img src={coverImg} alt={title} />
				<h2>
					<Link to={`/movie/${id}`}>{title}</Link>
				</h2>
				<p>{summary}</p>
				<ul>
					{genres.map((g) => (
						<li key={g}>{g}</li>
					))}
				</ul>
			</div>
		</div>
	);
}

Movie.propTypes = {
	id: PropType.number.isRequired,
	coverImg: PropType.string.isRequired,
	title: PropType.string.isRequired,
	summary: PropType.string.isRequired,
	genres: PropType.arrayOf(PropType.string).isRequired,
};

export default Movie;
