package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/isro")
public class TestController {
	
//	http://localhost:8080/isro/abc
	
	@GetMapping("/abc")
	public String action() {
		return "info";
	}
}
