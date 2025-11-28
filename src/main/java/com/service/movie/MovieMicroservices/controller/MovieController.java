package com.service.movie.MovieMicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.movie.MovieMicroservices.model.Movie;
import com.service.movie.MovieMicroservices.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieService movieservice;
	
	
	@GetMapping("/all")
	List<Movie> getAllMovies(){
		return movieservice.getAllMovies();
	}
	
	@GetMapping("/genre/{id}")
	List<Movie> getMovieByGenreId(@PathVariable Long id){
		return movieservice.getMovieByGenreId(id);
		
	}
	
	

}
