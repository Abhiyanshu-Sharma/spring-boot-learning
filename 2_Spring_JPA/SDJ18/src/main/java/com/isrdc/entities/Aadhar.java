package com.isrdc.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aadhars")
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aadharId;
	
	private String aadharNumber;
	
	private LocalDate issueDate;
	
	private LocalDate expiryDate;
	
	private String issueCenter;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	

	public Aadhar() {
		super();
	}
	

	public Aadhar(String aadharNumber, LocalDate issueDate, LocalDate expiryDate, String issueCenter, User user) {
		super();
		this.aadharNumber = aadharNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.issueCenter = issueCenter;
		this.user = user;
	}


	
	

	public Integer getAadharId() {
		return aadharId;
	}

	public void setAadharId(Integer aadharId) {
		this.aadharId = aadharId;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIssueCenter() {
		return issueCenter;
	}

	public void setIssueCenter(String issueCenter) {
		this.issueCenter = issueCenter;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", issueCenter=" + issueCenter + ", user=" + user + "]";
	}
	
}
