package com.isrdc.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(columnDefinition = "varchar(25) not null")
	private String name;
	
	@Column(length=120, nullable=false, unique=true )
	private String email;
	
	@Column(columnDefinition = "varchar(10) not null unique")
	private String phone;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime registrationDate;
	
	@UpdateTimestamp
//	@Column(insertable = false, nullable = true)
	private LocalDateTime changedDate;
	

	public Student() {
		super();
	}
	
	


	public Student(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}




	public Student(String name, String email, String phone, LocalDateTime registrationDate) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.registrationDate = registrationDate;
	}
	



	public Student(Integer studentId, String name, String email, String phone) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.phone = phone;
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


	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}


	public LocalDateTime getChangedDate() {
		return changedDate;
	}


	public void setChangedDate(LocalDateTime changedDate) {
		this.changedDate = changedDate;
	}	
}
