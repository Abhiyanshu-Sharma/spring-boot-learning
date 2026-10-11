package com.isrdc.beans;

import org.springframework.stereotype.Component;

@Component
public class ABean {
	public void info() {
		System.out.println("------  ABean.info() ---- ");		
		BBean a = new BBean();
		
		a.process();
	}
}
