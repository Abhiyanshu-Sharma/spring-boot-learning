package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController2 {
	@PostMapping("/abc")
	public String process() {
		return "next";
	}
}
