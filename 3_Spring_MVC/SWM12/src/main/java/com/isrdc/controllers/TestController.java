package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@GetMapping("/pro")
	@ResponseBody
	public String process() {
		
//		return "next";
//		return "<h2>next</h2>";
		return "{\"Name\":\"anmol\",\"Age\"=12}";
	}
	
}