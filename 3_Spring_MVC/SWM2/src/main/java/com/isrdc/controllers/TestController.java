package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/abc")
	public String infoPage() {
		return "info";
	}
	
	@RequestMapping("/mno")
	public String nextPage() {
		return "next";
	}
}
