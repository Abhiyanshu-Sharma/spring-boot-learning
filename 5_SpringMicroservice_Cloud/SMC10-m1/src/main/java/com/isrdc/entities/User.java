package com.isrdc.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("users")
public class User {
	
	@Id
	private Integer userId;
	private String name;
	
	
	
	public User() {
		super();
	}
	public User(Integer userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}
}
