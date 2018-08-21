package com.lhl.microserviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MicroserviceProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MicroserviceProjectApplication.class, args);
		new SpringApplicationBuilder(MicroserviceProjectApplication.class)
				.properties("server.port=0")
				.run(args);
	}

}
