package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.RdsEntity;

public interface RdsRepo extends JpaRepository<RdsEntity, Integer> {

}
