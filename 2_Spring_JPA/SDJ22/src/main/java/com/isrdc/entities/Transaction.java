package com.isrdc.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;
	
	private String transactionNumber;
	private LocalDate transactionDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;


	public Transaction() {
		super();
	}
	

	public Transaction(String transactionNumber, LocalDate transactionDate) {
		super();
		this.transactionNumber = transactionNumber;
		this.transactionDate = transactionDate;
	}


	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionNumber=" + transactionNumber
				+ ", transactionDate=" + transactionDate + ", user=" + user + "]";
	}
	
}
