package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
	@GetMapping("/abc")
	public String action() {
		return "info";
	}
	
	@PostMapping("/abc")
	public String process() {
		return "next";
	}
}
