package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.repo.MovieRatingRepo;

@Service
public class MovieRatingService {

	@Autowired
	MovieRatingRepo repo;
	@Autowired
	Environment env;
	
	public int getPortNumber()
	{
		return Integer.parseInt(env.getProperty("local.server.port"));
	}
	
	public MovieRating addRating(MovieRating rating)
	{
		MovieRating savedRating= repo.save(rating);
		savedRating.setPort(getPortNumber());
		return savedRating;
	}
	public MovieRating getRating(int id)
	{
		MovieRating rating =repo.getOne(id);
		rating.setPort(getPortNumber());
		return rating;
	}
}
