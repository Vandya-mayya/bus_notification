package com.example.busnotification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.busnotification.entity.addroute;
import com.example.busnotification.repository.addrouterepository;


@Service
public class addrouteservice {

	@Autowired
	addrouterepository addrepository;

	public void addroute(addroute r1) {
		addrepository.save(r1);
		
	}

	public List<addroute> getRecentRoutes() {
		Pageable pageable = PageRequest.of(0, 4); // Fetch 5 most recent records   
        return addrepository.findRecentRoutes(pageable);
}
	 
}

	
	
