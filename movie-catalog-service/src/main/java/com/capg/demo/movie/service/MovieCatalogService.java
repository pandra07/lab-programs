package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capg.demo.movie.dao.MovieCatalogRepo;
import com.capg.demo.movie.model.MovieCatalog;
import com.netflix.ribbon.proxy.annotation.Hystrix;
//import com.netflix.loadbalancer.Server;

@Service
public class MovieCatalogService {

	@Autowired
	private MovieCatalogRepo repo;
	
	@Autowired
	Environment env;
	
	public int getPortNumber()
	{
		return Integer.parseInt(env.getProperty("local.server.port"));
	}
	
	
	public MovieCatalog addCatalog(MovieCatalog catalog)
	{
		MovieCatalog savedCatalog=repo.save(catalog);
		savedCatalog.setPort(getPortNumber());
		return savedCatalog;
		
	}
	

	public MovieCatalog getCatalog(int id)
	{
		MovieCatalog savedCatalog=repo.getOne(id);
		savedCatalog.setPort(getPortNumber());
		return savedCatalog;
	}
}
