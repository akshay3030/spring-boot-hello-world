package com.akshay.springboots.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/world")
	public String controller_method(){
		return "Hello World from Spring Boot";
		
	}

}
