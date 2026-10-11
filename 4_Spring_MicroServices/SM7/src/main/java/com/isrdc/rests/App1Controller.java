package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")
public class App1Controller {
	
	@GetMapping("/pro")
	public String process() {
		
		return "Hello";
	}
}
