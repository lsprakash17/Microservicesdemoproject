package com.example.microserviceProject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prakash
 * @Controller for testing purpose.
 */
@RestController
public class Test {

	
	/**
	 * POST Method 
	 * For Concatination of two Strings
	 * @param value1
	 * @param value2
	 * @return String
	 */
	@PostMapping("/Concatination/{value1}/{value2}")
	public String helloWorld(@PathVariable String  value1,@PathVariable String  value2) {
		return value1 + value2;		
	}
	
	/**
	 * GET Method
	 * For Testing Controller
	 * @return String
	 */
	@GetMapping("test")
	public String helloWorld() {
		return "Hello world";
		
	}
}
