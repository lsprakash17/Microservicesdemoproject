package com.example.mainProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




/**
 * @author prakash
 * This is Discovery Project which has ability to call rest API of microservices.
 * SWAGGER URL : http://localhost:8080/swagger-ui/index.html
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainProjectApplication {
	
	//loading main class
	public static void main(String[] args) {
		SpringApplication.run(MainProjectApplication.class, args);
	}

	//defining @bean for Resttemplate
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
