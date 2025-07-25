package com.erdal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erdal.model.Saloon;

@Repository
public interface saloonRepository extends JpaRepository<Saloon, Long> {

	Saloon findByOwnerId(Long id);
	
	
	@Query( "SELECT s from Saloon s WHERE "
	        + "(lower(s.city) like lower(concat('%', :keyword, '%')) OR " 
			+ "(lower(s.saloonName) like lower(concat('%', :keyword, '%')) OR"
			+ "(lower(s.address) like lower(concat('%', :keyword, '%'))")
		List<Saloon> searchSaloons(@Param("keyword") String keyword);
	
	
	
}
