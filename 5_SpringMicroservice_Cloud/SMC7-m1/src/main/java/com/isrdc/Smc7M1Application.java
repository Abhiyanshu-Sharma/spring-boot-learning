package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Smc7M1Application {

	public static void main(String[] args) {
		SpringApplication.run(Smc7M1Application.class, args);
	}

}
