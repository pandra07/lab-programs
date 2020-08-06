package com.capg.demo.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MovieRating {

	@Id
	private int id;
	private double rating;
	@Transient
	private int port;
	
	
	public MovieRating() {
		// TODO Auto-generated constructor stub
	}
	public MovieRating(int id, double rating) {
		super();
		this.id = id;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
