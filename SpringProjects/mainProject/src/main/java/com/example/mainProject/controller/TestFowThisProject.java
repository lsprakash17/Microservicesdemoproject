package com.example.mainProject.controller;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author prakash
 * This controller is this projects own controller.
 *
 */
@RestController
public class TestFowThisProject {

	/**
	 * For testing Controller
	 * @category GET
	 * @return String
	 */
	@GetMapping("TestmainProjectAPI")
	public String name() {
		return "This is main project controller";
		
	}
}
