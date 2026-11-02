package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Smc9ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Smc9ApiGatewayApplication.class, args);
	}

}
