package com.isrdc.configs;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProps {

	private List<String> data;
	
	public List<String> getData() {
		return data;
	}
	
	public void setData(List<String> data) {
		this.data = data;
	}
}
