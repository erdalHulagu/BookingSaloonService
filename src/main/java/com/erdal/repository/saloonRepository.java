package com.erdal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erdal.model.Saloon;

@Repository
public interface SaloonRepository extends JpaRepository<Saloon, Long> {

	Saloon findByOwnerId(Long id);
	
	
	 @Query("SELECT s FROM Saloon s WHERE " +
	           "lower(s.city) LIKE lower(concat('%', :city, '%')) OR " +
	           "lower(s.saloonName) LIKE lower(concat('%', :city, '%')) OR " +
	           "lower(s.address) LIKE lower(concat('%', :city, '%'))")
	    List<Saloon> searchSaloons(@Param("city") String city);
	
	
	
	
}
