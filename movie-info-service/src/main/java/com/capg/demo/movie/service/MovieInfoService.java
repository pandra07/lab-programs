package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.movie.model.MovieCatalog;
import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.model.MovieRating;

@Service
public class MovieInfoService {
	@Autowired
	RestTemplate rt;

	public MovieInfo getMovieInfo(int id)
	{
		MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/rating/id/"+id, MovieRating.class);
		MovieCatalog catalog=rt.getForObject("http://MOVIE-CATALOG-SERVICE/catalog/id/"+id, MovieCatalog.class);
		
		MovieInfo movieInfo=new MovieInfo(id, catalog.getMovieName(), rating.getRating());
		movieInfo.setMovieCatalogPort(catalog.getPort());
		movieInfo.setMovieRatingPort(rating.getPort());
		return movieInfo;
	}
	
	public MovieInfo addMovieInfo( MovieInfo movie)
	{
		MovieRating rating=new MovieRating(movie.getId(), movie.getRating());
		MovieCatalog catalog=new MovieCatalog(movie.getId(), movie.getMovieName());
		
		rating=rt.postForObject("http://MOVIE-RATING-SERVICE/rating/add", rating, MovieRating.class);
		catalog=rt.postForObject("http://MOVIE-CATALOG-SERVICE/catalog/add", catalog, MovieCatalog.class);
		
	movie =new MovieInfo(catalog.getId(), catalog.getMovieName(), rating.getRating());
		return movie;
	}
}
