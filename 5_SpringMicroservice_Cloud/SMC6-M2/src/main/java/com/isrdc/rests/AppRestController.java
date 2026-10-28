package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
	
	@Autowired
	private Environment env;

	@GetMapping("/act")
	public String action() {
		
		String port = env.getProperty("server.port");
		
		return "Action Method - " + port;
	}
	
	@PostMapping("/info")
	public String information() {
		
		String port = env.getProperty("server.port");
		
		return "Information Method - " + port;
	}
}
