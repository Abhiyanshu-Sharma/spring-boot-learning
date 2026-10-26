package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/info")
	public String Information() {
		return "Information Method called";
	}
}
