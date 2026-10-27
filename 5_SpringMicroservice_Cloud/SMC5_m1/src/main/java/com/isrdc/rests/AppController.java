package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.feigns.M2Client;

@RestController
public class AppController {
	
	@Autowired
	private M2Client m2Client; 

	@GetMapping("/pro")
	public String process() {
		
		String res = m2Client.m2Act();
		
		return "Process Method - MicroService 1 " + "Response - " + res;
	}
}
