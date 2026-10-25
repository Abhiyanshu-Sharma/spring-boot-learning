package com.isrdc.rests;

import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.UserNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {
	
	@GetMapping("/pro/{uid}")
	public String process(@PathVariable Integer uid) {
		
		if(uid > 100) {
			throw new UserNotFoundException("Invalid User Id...");
		}
		
		System.out.println("User Record Exists...");
		
		return "User Record Exists...";
	}
}
