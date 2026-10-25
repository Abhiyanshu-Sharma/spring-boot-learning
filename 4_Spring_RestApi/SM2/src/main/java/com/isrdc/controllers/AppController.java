package com.isrdc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/pro")
	public String process() {
		return "Some text to show info";
	}
}
