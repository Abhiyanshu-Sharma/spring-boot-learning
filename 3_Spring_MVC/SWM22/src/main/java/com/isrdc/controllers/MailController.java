package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.services.EmailService;

@Controller
public class MailController {
	
	@Autowired
	private EmailService emailServ;
	
	@GetMapping("/send_mail")
	public String sendEmail(String email, String subject, String message) {
		
		emailServ.sendEmail(email, subject, message);
		
		return "index";
	}
}
