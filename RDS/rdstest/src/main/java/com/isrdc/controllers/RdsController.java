package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.isrdc.dtos.RdsDto;
import com.isrdc.services.RdsService;

@Controller
public class RdsController {
	
	@Autowired
	private RdsService rdsServ;
	
	@GetMapping("/save_req")
	public String savePage(Model model) {
		
		model.addAttribute("user_dto", new RdsDto());
		
		return "next.html";
	}
	
	@PostMapping("/rds_req")
	public String respPage(RdsDto rdsDto) {
	
		System.out.println(rdsDto + " ++++++++++++++++");
		rdsServ.saveRdsRec(rdsDto);
		
		return "index.html";
	}
}
