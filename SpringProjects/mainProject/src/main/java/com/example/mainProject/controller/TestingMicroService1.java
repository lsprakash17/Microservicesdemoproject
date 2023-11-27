package com.example.mainProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mainProject.Dao.TestingMicroservice1Dao;



/**
 * @author prakash
 * This controller is for Microservices.
 *  
 */
@RestController
public class TestingMicroService1 {
	//Autowiring DAO layer
	@Autowired
	private  TestingMicroservice1Dao testingMicroservice1Dao;
	
	/**
	 * POST Method
	 * Work : Concatinating Two Strings
	 * @param value1 type String
	 * @param value2 type String
	 * @return Concatinated String
	 */
	@PostMapping("concat/{value1}/{value2}")
	public String helloWorld(@PathVariable String  value1,@PathVariable String  value2) {
		// passing values to DAO layer
		return testingMicroservice1Dao.addTwoString(value1,value2);	
	}
	
	
	/**
	 * GET Method
	 * Work: testing API
	 * @return String
	 */
	@GetMapping("microservice1test")
	public String testing() {
		return testingMicroservice1Dao.getTestResult();
		
	}
}
