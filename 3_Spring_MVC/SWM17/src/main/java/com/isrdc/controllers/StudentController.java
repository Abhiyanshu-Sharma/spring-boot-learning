package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.isrdc.dtos.StudentDTO;
import com.isrdc.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentServ;
	
	@PostMapping("/signup")
	public String signupUser(String name, String email, String phone, String country) {
		
		StudentDTO studentDTO = new StudentDTO(name, email, phone, country);
		
		studentServ.saveStudent(studentDTO);
		
		return "signup_success";
	}
}
