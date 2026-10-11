package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
