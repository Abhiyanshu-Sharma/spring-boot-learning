package com.isrdc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	private Integer employeeId;
	private String name;
	private String email;
	private String phone;
	
	
	
	public Employee() {
		super();
	}
	public Employee(Integer employeeId) {
		super();
		this.employeeId = employeeId;
	}
	public Employee(Integer employeeId, String name, String email, String phone) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
}
