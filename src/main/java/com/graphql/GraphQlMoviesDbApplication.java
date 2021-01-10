package com.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GraphQlMoviesDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlMoviesDbApplication.class, args);
	}

}
