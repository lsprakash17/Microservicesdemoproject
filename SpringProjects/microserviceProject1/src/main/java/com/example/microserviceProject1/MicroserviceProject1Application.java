package com.example.microserviceProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author prakash
 * @EnableEurekaClient is for microservices annotation
 * This is microservice project.
 * SWAGGER URL : http://localhost:8666/swagger-ui/index.html
 */
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProject1Application.class, args);
	}

}
