package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/act")
	public String action(Model model) {
		model.addAttribute("message", "Namaste Good Morning...!!!");
		
		return "next";
	}
}