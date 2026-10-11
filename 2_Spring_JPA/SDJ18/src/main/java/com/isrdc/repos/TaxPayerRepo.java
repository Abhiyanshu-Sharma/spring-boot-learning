package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.TaxPayer;

public interface TaxPayerRepo extends JpaRepository<TaxPayer, Integer> {

}
