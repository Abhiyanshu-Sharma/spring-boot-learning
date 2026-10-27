package com.isrdc.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "smc5-m2")
public interface M2Client {
	
	@GetMapping("/act")
	public String m2Act();
}
