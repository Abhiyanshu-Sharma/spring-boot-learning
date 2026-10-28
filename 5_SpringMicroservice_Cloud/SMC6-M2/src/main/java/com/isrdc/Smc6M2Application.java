package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Smc6M2Application {

	public static void main(String[] args) {
		SpringApplication.run(Smc6M2Application.class, args);
	}

}
