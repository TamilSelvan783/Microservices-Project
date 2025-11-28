package com.service.genre.GenreMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.genre.GenreMicroService.model.Genre;
import com.service.genre.GenreMicroService.model.Movie;
import com.service.genre.GenreMicroService.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreServiceController {
	@Autowired
	private GenreService genreservice;
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/all")
	private List<Genre> getAllGenre(){
		List<Genre> genreList = genreservice.getAllGenres();
		
		
		for (Genre genre : genreList) {
			List<Movie> moviesList = restTemplate.getForObject("http://movie-service/movie/genre/" + genre.getId(), List.class);
			genre.setMovieList(moviesList);
		}
		return  genreList;
				
	}
	
	@GetMapping("/{id}")
	private Genre getGenreById(@PathVariable Long id) {
		Genre genre=genreservice.getGenreById(id);
		List<Movie> moviesList = restTemplate.getForObject("http://movie-service/movie/genre/" + id, List.class);
		genre.setMovieList(moviesList);
		return genre;
	}
	

}
