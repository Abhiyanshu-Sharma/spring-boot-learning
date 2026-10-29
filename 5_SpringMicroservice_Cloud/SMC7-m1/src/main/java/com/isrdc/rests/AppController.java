package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m1")
public class AppController {

	@GetMapping("/pro")
	public String process() {
		
		return "Process Method";
	}
	
	@GetMapping("/info")
	public String information() {
		
		return "Information Method";
	}
}
