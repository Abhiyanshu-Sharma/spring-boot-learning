package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2")
public class App2Controller {
	
	@GetMapping("/pro")
	public String process() {
		
		return "Hello";
	}
}
