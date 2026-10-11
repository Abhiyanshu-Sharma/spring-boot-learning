package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@PostMapping("/save_user")
	public String saveUser(@RequestParam("name") String name,
							@RequestParam("email") String email,
							@RequestParam("phone") String phone,
							@RequestParam("country") String country,
							Model model) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(country);
		return "form";
	}
	
	
	@GetMapping("/show_form")
	public String showForm() {
		return "form";
	}
}
