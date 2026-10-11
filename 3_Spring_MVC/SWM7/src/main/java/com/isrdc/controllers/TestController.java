package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("/info")
	public ModelAndView information() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("college", "SRIT");
		mav.setViewName("next");
		
		return mav;
	}
	
	@GetMapping("/act")
	public ModelAndView action() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("show");
		
		return mav;
	}
}
