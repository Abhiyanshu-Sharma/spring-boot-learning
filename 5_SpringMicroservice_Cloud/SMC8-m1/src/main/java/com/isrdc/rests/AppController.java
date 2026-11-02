package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AppController {
	
	@Value("${msg}")
	private String message;
	
	@GetMapping("/pro")
	public String process() {
		return "Process Method - " + message;
	}
}
