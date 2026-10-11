package com.isrdc.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID studentId;
	
	private String name;
	
	private String email;
	
	private String college;

	public UUID getStudentId() {
		return studentId;
	}
	

	public Student() {
		super();
	}


	public Student(String name, String email, String college) {
		super();
		this.name = name;
		this.email = email;
		this.college = college;
	}



	public void setStudentId(UUID studentId) {
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", college=" + college + "]";
	}
	
	
}
