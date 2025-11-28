package com.service.movie.MovieMicroservices.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.movie.MovieMicroservices.dao.MovieDAO;
import com.service.movie.MovieMicroservices.model.Movie;
import com.service.movie.MovieMicroservices.service.MovieService;
@Service
public class MovieSeviceImpl implements MovieService {
    
	
	@Autowired
	private MovieDAO movieDAO;
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDAO.getAllMovies();
	}

	@Override
	public List<Movie> getMovieByGenreId(Long genreId) {
		// TODO Auto-generated method stub
		return movieDAO.getMovieByGenreId(genreId);
	}

}
