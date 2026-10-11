package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isrdc.dtos.UserDTO;

@Controller
public class TestController {
	
	@GetMapping("/act")
	public ModelAndView action() {
		ModelAndView mav = new ModelAndView();
		
		UserDTO usserDTO = new UserDTO("manoj", 18, "JEC", 89.45f);
		
		mav.addObject("student", usserDTO);
		mav.setViewName("next");
		
		return mav;
	}
}
