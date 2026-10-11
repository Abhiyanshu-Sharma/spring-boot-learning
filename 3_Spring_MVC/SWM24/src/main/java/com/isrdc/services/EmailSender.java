package com.isrdc.services;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
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
		
		try {
		
			MimeMessageHelper mmh = new MimeMessageHelper(mm, true);
			
			mmh.setTo(email);
			mmh.setSubject("PDF file Attached in this example");
			String message = "<h1>Now HTML Mail Message... Test Demo !</h1>";
			mmh.setText(message, true);
			
			FileSystemResource fsr = new FileSystemResource(new File("git-cheat-sheet.pdf"));
			mmh.addAttachment("Git-Cheat-Cheat.pdf", fsr, "application/pdf");;
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		javaMailSender.send(mm);
	}
}
