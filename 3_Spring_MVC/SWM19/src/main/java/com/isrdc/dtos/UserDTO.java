package com.isrdc.dtos;

public class UserDTO {
	private Integer userId;
	private String name;
	private String email;
	private String phone;
	private String uid;
	
	public UserDTO() {
		super();
	}

	public UserDTO(String name, String email, String phone, String uid) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.uid = uid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", email=" + email + ", phone=" + phone + ", uid=" + uid
				+ "]";
	}
}