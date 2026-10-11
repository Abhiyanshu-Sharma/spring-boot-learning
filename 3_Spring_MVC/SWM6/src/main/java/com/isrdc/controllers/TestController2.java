package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nasa")
public class TestController2 {
	
//	http://localhost:8080/nasa/abc
	
	@GetMapping("/abc")
	public String process() {
		return "next";
	}
}
