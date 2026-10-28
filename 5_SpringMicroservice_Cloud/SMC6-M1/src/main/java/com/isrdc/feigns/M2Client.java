package com.isrdc.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("SMC6-M2")
public interface M2Client {
	
	@GetMapping("/act")
	public String m2Action();
	
	@PostMapping("/info")
	public String m2Information();
}
