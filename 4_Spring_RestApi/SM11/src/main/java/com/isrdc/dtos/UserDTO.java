package com.isrdc.dtos;

public class UserDTO {
	
	private String name;
	private Integer age;
	private String phone;
	
	
	
	public UserDTO() {
		super();
	}
	public UserDTO(String name, Integer age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
}
