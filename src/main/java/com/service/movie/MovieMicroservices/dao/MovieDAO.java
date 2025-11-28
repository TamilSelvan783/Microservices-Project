package com.service.movie.MovieMicroservices.dao;

import java.util.List;

import com.service.movie.MovieMicroservices.model.Movie;

public interface MovieDAO {
	
	
	List<Movie> getAllMovies();
	
	List<Movie> getMovieByGenreId(Long genreId);
	
	
	

}
