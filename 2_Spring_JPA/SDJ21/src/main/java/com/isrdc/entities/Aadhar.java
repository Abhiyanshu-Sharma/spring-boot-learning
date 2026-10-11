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
	
	private String issueAuthority;
	
	
	
	public Aadhar() {
		super();
	}

	public Aadhar(String aadharNumber, LocalDate issueDate, String issueAuthority, User user) {
		super();
		this.aadharNumber = aadharNumber;
		this.issueDate = issueDate;
		this.issueAuthority = issueAuthority;
		this.user = user;
	}

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

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

	public String getIssueAuthority() {
		return issueAuthority;
	}

	public void setIssueAuthority(String issueAuthority) {
		this.issueAuthority = issueAuthority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	@Override
//	public String toString() {
//		return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", issueDate=" + issueDate
//				+ ", issueAuthority=" + issueAuthority + ", user=" + user + "]";
//	}
	
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", issueDate=" + issueDate
				+ ", issueAuthority=" + issueAuthority +  "]";
	}
	
}
