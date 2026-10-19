package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
