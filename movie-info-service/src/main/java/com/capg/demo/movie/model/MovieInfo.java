package com.capg.demo.movie.model;

public class MovieInfo {

	private int id;
	private String movieName;
	private double rating;
	private int movieRatingPort;
	private int movieCatalogPort;
	public MovieInfo() {
		// TODO Auto-generated constructor stub
	}
	public MovieInfo(int id, String movieName, double rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getMovieRatingPort() {
		return movieRatingPort;
	}
	public void setMovieRatingPort(int movieRatingPort) {
		this.movieRatingPort = movieRatingPort;
	}
	public int getMovieCatalogPort() {
		return movieCatalogPort;
	}
	public void setMovieCatalogPort(int movieCatalogPort) {
		this.movieCatalogPort = movieCatalogPort;
	}
	
}
