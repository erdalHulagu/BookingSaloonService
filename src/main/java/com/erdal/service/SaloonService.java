package com.erdal.service;

import java.util.List;

import com.erdal.DTO.UserDTO;
import com.erdal.model.Saloon;
import com.erdal.requests.SaloonRequest;

public interface SaloonService {
	
	Saloon createSaloon(SaloonRequest saloonRequest, UserDTO userDTO);
	
	
	Saloon updateSaloon(SaloonRequest SaloonRequest, UserDTO userDTO, Long saloonId);
	
	
	List<Saloon> getAllSaloon();
	
	
	Saloon getSaloonByOwnerId(Long ownerId);
	
	
	Saloon getSaloonById(Long saloonId);
	
	
	List<Saloon> searchSaloonByCityName(String city);
	
	
	void deleteSaloonByOwnerId(Long ownerId);

}
