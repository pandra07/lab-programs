package com.capg.demo.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MovieEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieEurekaNamingServerApplication.class, args);
	}

}
