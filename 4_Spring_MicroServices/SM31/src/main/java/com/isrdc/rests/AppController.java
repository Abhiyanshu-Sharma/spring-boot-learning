package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Value("${app.data}")
	private String data; 
	
	@GetMapping("/pro")
	public String process() {
		
		System.out.println(data + "---------------------");
		
		return data;
	}
}
