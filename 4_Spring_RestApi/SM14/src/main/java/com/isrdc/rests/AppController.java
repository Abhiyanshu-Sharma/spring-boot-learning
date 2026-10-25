package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/pro")
	public String process(@RequestHeader String book) { 
		return book + " book";
	}
}
