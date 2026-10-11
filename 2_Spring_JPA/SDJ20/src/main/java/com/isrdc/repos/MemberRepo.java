package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Member;

public interface MemberRepo extends CrudRepository<Member, Integer>{

}
