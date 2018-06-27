package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.MovieModel;

public interface MovieRepo extends JpaRepository<MovieModel, String> {
		
		MovieModel findMovieByTitle(String title);
		
	}

