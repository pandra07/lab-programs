package com.capg.demo.movie.model;



public class MovieCatalog {

	private int id;
	private	String MovieName;
	private int port;
	public MovieCatalog() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MovieCatalog(int id, String MovieName) {
		super();
		this.id = id;
		this.MovieName = MovieName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
}
