package com.isrdc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A1Bean {

	private BBean a;
	
	public A1Bean() {
		System.out.println("---- A1Bean() --- Constructor DI -----");
	}
	
//	@Autowired
	public A1Bean(BBean a) {
		System.out.println("---- A1Bean(BBean B) --- Constructor DI -----");
		this.a = a;
	}
	
	public void info() {
		System.out.println("--Dependency Injection ----  A1Bean.info() ---- ");
		
		a.process();
	}
}
