package com.isrdc.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Value("${app.data}")
	private List<String> data;
	
	@GetMapping("/pro")
	public List<String> process() {
		System.out.println(data + "-----------");
		
		return data;
	}
}
