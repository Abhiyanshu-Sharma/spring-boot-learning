package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Value("${app.data1}")
	private Integer data1;
	
	@Value("${app.data2}")
	private Boolean data2;
	
	@Value("${app.data3}")
	private Double data3;
	
	@GetMapping("/pro")
	public String process() {
		
		System.out.println(" "+ data1 + data2 + data3);
		
		return " "+ data1 + data2 + data3;
	}
}
