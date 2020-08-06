package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.service.MovieRatingService;

@RestController
public class MovieRatingController {

	@Autowired
	MovieRatingService service;
	
	@GetMapping("/rating/id/{id}")
	public MovieRating getRating(@PathVariable int id)
	{
		return service.getRating(id);
	}
	@PostMapping("/rating/add")
	public MovieRating addRating(@RequestBody MovieRating rating)
	{
		return service.addRating(rating);
	}
}
