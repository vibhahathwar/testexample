package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EqulityService;

@RestController
public class TestController {
	
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	EqulityService equilityService;
	
	@GetMapping("/checkstring")
	public @ResponseBody String checkEquality() {
		logger.info("Inside check equality method");
		
		String s1 = "hello";
		String s2 = new String("hello");
		Boolean flag =  equilityService.Check(s1, s2);
		if(flag) {
			return "strings are equal";
		}else {
			return "Strings are not equal";
		}
	}

}
