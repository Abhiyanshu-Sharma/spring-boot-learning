package com.isrdc.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.RdsDto;
import com.isrdc.entities.RdsEntity;
import com.isrdc.repos.RdsRepo;

@Service
public class RdsService {
	
	@Autowired
	private RdsRepo rdsRepo;
	
	public void saveRdsRec(RdsDto rdsDto) {
		RdsEntity rdsEnt = new RdsEntity();
		
		BeanUtils.copyProperties(rdsDto, rdsEnt);
		
		rdsRepo.save(rdsEnt);
	}
}
