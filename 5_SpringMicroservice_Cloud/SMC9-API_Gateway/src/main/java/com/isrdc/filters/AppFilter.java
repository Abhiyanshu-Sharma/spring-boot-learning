package com.isrdc.filters;

import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AppFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		System.out.println("--------------Filter Ran---------------");
		
		ServerHttpRequest request = exchange.getRequest();
		
		HttpHeaders headers = request.getHeaders();
		
		Set<String> headerNames = headers.headerNames();
		
		if(!headerNames.contains("secret")) {
			throw new RuntimeException("Invalid Request...");
		}
		
		List<String> list = headers.get("secret");
		
		if(!list.get(0).contains("yam007")) {
			throw new RuntimeException("Invalid Request...");
		}
		
		return chain.filter(exchange);
	}
}
