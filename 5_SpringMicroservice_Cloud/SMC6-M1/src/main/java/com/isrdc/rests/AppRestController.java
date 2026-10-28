package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.feigns.M2Client;

@RestController
public class AppRestController {
	
	@Autowired
	private M2Client m2CLient;

	@GetMapping("/pro")
	public String process() {
		
		String res = m2CLient.m2Action();
		String res2 = m2CLient.m2Information();
		
		return "Process Method - " + res + " - " + res2;
	}
}
