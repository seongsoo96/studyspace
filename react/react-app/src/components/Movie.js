import PropType from "prop-types";
import { Link } from "react-router-dom";
import styles from "./Movie.module.css";

function Movie({ id, coverImg, title, year, summary, genres }) {
	return (
		<div className={styles.movie}>
			<img src={coverImg} alt={title} className={styles.movie__img} />
			<div>
				<h2 className={styles.movie__title}>
					<Link to={`/movie/${id}`}>{title}</Link>
				</h2>
				<h3 className={styles.movie__year}>{year}</h3>
				<p>
					{summary.length > 235
						? `${summary.slice(0, 235)}...`
						: summary}
				</p>
				<ul className={styles.movie__genres}>
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
