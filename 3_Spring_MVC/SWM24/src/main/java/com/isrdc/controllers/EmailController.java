package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.services.EmailSender;

@Controller
public class EmailController {
	
	@Autowired
	private EmailSender emailSender;
	
	@GetMapping("/send_mail")
	public String sendEmail(String email) {
		
		emailSender.sendEmail(email);
		
		return "index";
	}
}
