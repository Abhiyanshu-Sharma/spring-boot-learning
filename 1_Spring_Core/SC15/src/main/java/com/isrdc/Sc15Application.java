package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.beans.ABean;

@SpringBootApplication
public class Sc15Application {

	public static void main(String[] args) {
	 	ConfigurableApplicationContext context = SpringApplication.run(Sc15Application.class, args);
	 	
	 	ABean x = context.getBean(ABean.class);
	 	
	 	x.doWork();
	 	x.doWork();
	 	x.doWork();
	 	
		
	}

}
