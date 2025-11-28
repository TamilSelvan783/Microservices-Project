package com.service.movie.MovieMicroservices.service;

import java.util.List;

import com.service.movie.MovieMicroservices.model.Movie;

public interface MovieService {
	
	
	

	List<Movie> getAllMovies();
	
	List<Movie> getMovieByGenreId(Long genreId);
	
	
	
	
}
