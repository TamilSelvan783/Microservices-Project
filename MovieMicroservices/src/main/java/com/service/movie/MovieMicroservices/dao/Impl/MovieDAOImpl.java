package com.service.movie.MovieMicroservices.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.service.movie.MovieMicroservices.dao.MovieDAO;
import com.service.movie.MovieMicroservices.model.Movie;
@Repository
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from movie",BeanPropertyRowMapper.newInstance(Movie.class));
	}
	
	
	
	@Override
	public List<Movie> getMovieByGenreId(Long genreId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from movie where genre_Id=?", 
				(rs,rowNum)->{
					Movie m=new Movie();
					m.setId(rs.getLong(1));
					m.setName(rs.getString(2));
					m.setYear(rs.getInt(3));
					m.setGenreId(genreId);
							
					return m;
				
				},genreId);
		
		
		
		
		
		
	}

}
