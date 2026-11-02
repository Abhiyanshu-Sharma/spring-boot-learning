package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Smc9M2Application {

	public static void main(String[] args) {
		SpringApplication.run(Smc9M2Application.class, args);
	}

}
