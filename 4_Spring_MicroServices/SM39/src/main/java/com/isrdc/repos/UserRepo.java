package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.isrdc.entities.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Integer>{

}
