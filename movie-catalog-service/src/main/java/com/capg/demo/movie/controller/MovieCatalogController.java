package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieCatalog;
import com.capg.demo.movie.service.MovieCatalogService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class MovieCatalogController {

	@Autowired
	MovieCatalogService service;
	
	@GetMapping("/catalog/id/{id}")
//	@HystrixCommand(fallbackMethod = "getMovieInfoFallBack",
//	commandProperties = {
//@HystrixProperty(name = "execution.timeout.enabled",value = "true" ), 
//@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
//@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
//@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
//@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
//@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")
//	})
	public MovieCatalog getMovieInfo(@PathVariable int id) 
	{
//		int x=1/0;
//		System.out.println("hello........................");
		//Thread.sleep(5000);
		return service.getCatalog(id);
	}
	
	@PostMapping("/catalog/add")
	public MovieCatalog addMovieCatalog(@RequestBody MovieCatalog catalog)
	{
		return service.addCatalog(catalog);
	}
	
	public MovieCatalog getMovieInfoFallBack(@PathVariable int id)
	{
		return new MovieCatalog(id, "surya");
	}
	
}
