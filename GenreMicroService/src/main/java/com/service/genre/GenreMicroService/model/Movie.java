package com.service.genre.GenreMicroService.model;

public class Movie {
	
	private long id;
    private String name;
    private int year;
    private long genreId;
    public Movie() {
    	
    }
	public Movie(long id, String name, int year, long genreId) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.genreId = genreId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getGenreId() {
		return genreId;
	}
	public void setGenreId(long genreId) {
		this.genreId = genreId;
	}

	
	
	
	

}
