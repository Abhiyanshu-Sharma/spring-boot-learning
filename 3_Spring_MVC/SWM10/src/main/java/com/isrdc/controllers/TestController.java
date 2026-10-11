package com.isrdc.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isrdc.dtos.StudentDTO;

@Controller
public class TestController {
	@GetMapping("/show_users")
	public ModelAndView showUsers() {
		ModelAndView mav = new ModelAndView();
		
		StudentDTO s1 = new StudentDTO("Deepak", 9, 'M', "ABC");
		StudentDTO s2 = new StudentDTO("Prakhar", 12, 'M', "MNO");
		StudentDTO s3 = new StudentDTO("Mukta", 5, 'F', "PQR");
		StudentDTO s4 = new StudentDTO("Naman", 15, 'M', "KKJ");
		StudentDTO s5 = new StudentDTO("Praneeti", 7, 'F', "XYZ");
		StudentDTO s6 = new StudentDTO("Mugdha", 11, 'F', "OPQ");
		
		mav.addObject("records", Arrays.asList(s1,s2,s3,s4,s5,s6));
		mav.setViewName("records");
		
		return mav;
	}
}