package com.isrdc.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.configs.AppProps;

@RestController
public class AppController {
	
//	@Value("${app.data}")
//	private List<String> data;
	
	@Value("${app.records}")
	private List<String> records;
	
	@Autowired
	private AppProps appProps;
	
	@GetMapping("/pro")
	public String process() {
//		System.out.println(data + "-----------");
		System.out.println(appProps.getData());
		System.out.println(records);
		
		
		return "Hello";
	}
}
