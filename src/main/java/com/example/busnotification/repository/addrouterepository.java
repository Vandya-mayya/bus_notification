package com.example.busnotification.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.busnotification.entity.addroute;
@Repository
public interface addrouterepository extends JpaRepository<addroute, Integer> {
	
	@Query("SELECT r FROM addroute r ORDER BY r.routeNumber DESC")
	

	
	List<addroute> findRecentRoutes(Pageable pageable);
}
