package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {
	
	@GetMapping("/pro2")
	public String process2(@RequestParam("college") String clg, @RequestParam("semester") Integer sem, @RequestParam("marks") Float mrk, Model model) {
		model.addAttribute("college", clg);
		model.addAttribute("semester", sem);
		model.addAttribute("marks", mrk);
		
		return "info";
	}
	
	@GetMapping("/pro")
	public String process(Integer semester, String college, Float marks, Model model) {
		model.addAttribute("college", college);
		model.addAttribute("semester", semester);
		model.addAttribute("marks", marks);
		
		return "info";
	}
	
	@GetMapping("/act")
	public String action(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
//		String age = request.getParameter("age");
		Integer age = Integer.parseInt(request.getParameter("age"));
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
					
		return "next";
	}
}
