package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Post;

public interface PostRepo extends CrudRepository<Post, Integer> {

}
