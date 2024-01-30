package com.rovicorp.datamill;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableJSONDoc
@EnableCaching
public class TMDBServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TMDBServicesApplication.class, args);
	}
}