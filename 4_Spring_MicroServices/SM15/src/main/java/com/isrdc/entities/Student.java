package com.isrdc.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	private String name;
	private Date dob;
	private String email;
	private String phone;
	
	public Student() {
		super();
	}

	public Student(String name, Date dob, String email, String phone) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
	}
		
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", email=" + email + ", phone="
				+ phone + "]";
	}

	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
