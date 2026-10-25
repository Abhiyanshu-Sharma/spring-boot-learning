package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	
	@GetMapping("/pro")
	public String process() {
		return "process called";
	}
	
	@GetMapping("/info")
	public String information() {
		return "information called";
	}
}
