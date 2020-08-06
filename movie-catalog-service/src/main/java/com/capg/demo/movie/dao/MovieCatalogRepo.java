package com.capg.demo.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.movie.model.MovieCatalog;

public interface MovieCatalogRepo extends JpaRepository<MovieCatalog, Integer>{

	
}
