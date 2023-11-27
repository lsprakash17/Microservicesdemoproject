package com.eurekaserver.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



/**
 * @author Prakash
 * This @EnableEurekaServer is dependent to "spring-cloud-starter-netflix-eureka-client"
 * This project only Enables Eureka Server
 * To check UI of Server visit @url http://localhost:8761
 * @port is defined in properties file as 8761
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
