package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
	@GetMapping("/study/{chapter}/{pageno}")
	public String studyResp(@PathVariable("chapter") Integer chapter, @PathVariable("pageno") Integer pageno, Model model) {
		
		model.addAttribute("chapter", chapter);
		model.addAttribute("pageno", pageno);
		
		return "next";
	}
}