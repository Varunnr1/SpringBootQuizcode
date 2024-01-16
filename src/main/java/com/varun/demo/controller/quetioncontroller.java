package com.varun.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quetioncontroller {
	
	@RequestMapping("/getQuestion")
	public String getQuestion() {
		return "questions";
	}

}
