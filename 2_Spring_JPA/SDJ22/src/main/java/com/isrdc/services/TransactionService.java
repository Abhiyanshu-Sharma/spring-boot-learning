package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.repos.TransactionRepo;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepo tranRepo;
	
	public void showTransaction() {
		System.out.println(tranRepo.findById(5) + "---");
	}
}
