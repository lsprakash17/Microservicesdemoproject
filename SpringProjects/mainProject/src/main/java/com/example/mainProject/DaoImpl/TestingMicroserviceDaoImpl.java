package com.example.mainProject.DaoImpl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.mainProject.Dao.TestingMicroservice1Dao;
import com.google.inject.Inject;

/**
 * @author prakash
 * @service layer for @controller TestingMicroService1
 */
@Service
public class TestingMicroserviceDaoImpl implements TestingMicroservice1Dao {

	// autowiring RestTemplate
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String addTwoString(String value1, String value2) {
		// declaring Url
		String url = "http://localhost:8666//Concatination/" + value1 + "/" + value2;
		// set http header contents
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		HttpEntity entity = new HttpEntity(headers);
		// calling microservice
		ResponseEntity<String> result = restTemplate.postForEntity(url, entity, String.class);
		return result.getBody();
	}

	@Override
	public String getTestResult() {
		// declaring Url
		String url = "http://localhost:8666/test";
		
		// calling microservice
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		return response.getBody();
	}

}
