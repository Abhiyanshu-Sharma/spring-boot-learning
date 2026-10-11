package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isrdc.dtos.UserDTO;

@Controller
public class UserController {

//	@PostMapping("/save_user")
//	public String saveUser(@RequestParam("name") String name,
//							@RequestParam("email") String email,
//							@RequestParam("phone") String phone,
//							@RequestParam("country") String country,
//							Model model) {
//		
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(phone);
//		System.out.println(country);
//	
//	UserDTO userDTO = new userDTO(name, email, phone, country);
//		
//		return "form";
//	}
	
	@PostMapping("/save_user")
	@ResponseBody
	public String saveUser(@ModelAttribute UserDTO userDTO) {
		
		System.out.println(userDTO);
		
		return userDTO.toString();
	}
	
	
	@GetMapping("/show_form")
	public String showForm(Model model) {
		
		UserDTO userDTO = new UserDTO();
		model.addAttribute("user_dto", userDTO);
		
		return "form";
	}
}
