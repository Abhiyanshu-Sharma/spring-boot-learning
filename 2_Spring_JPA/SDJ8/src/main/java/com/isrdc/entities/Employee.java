package com.isrdc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeId;
	
	@Column(name="emp_name", length=25, nullable=false)
//	@Column(name="emp_name", columnDefinition="varchar(25) not null")
	private String name;
	
	@Column(name="emp_email", unique=true)
	private String email;
	
//	@Column(name="emp_phone", nullable=false)
//	@Column(name="emp_phone", columnDefinition = "not null")    Error: Must start with data-type then  not null
	@Column(name="emp_phone", columnDefinition = "varchar(10) not null")
	private String phone;
	
	
	
	public Employee() {
		super();
	}
	public Employee(Integer employeeId) {
		super();
		this.employeeId = employeeId;
	}
	
	public Employee(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
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
