package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSender {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmail(String email) {
		MimeMessage mm = javaMailSender.createMimeMessage();
		
		MimeMessageHelper mmh = new MimeMessageHelper(mm);
		
		try {
			
			mmh.setTo(email);
			mmh.setSubject("Kuch Naya Hogya");
			String message = "<h1>Now HTML Mail Message... Test Demo !</h1>";
			mmh.setText(message, true);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		javaMailSender.send(mm);
	}
}
