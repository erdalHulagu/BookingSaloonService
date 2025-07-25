package com.erdal.mapper;

import com.erdal.DTO.SaloonDTO;
import com.erdal.model.Saloon;

public class SaloonMapper {
	
	public static SaloonDTO mapToSaloonDTO(Saloon saloon) {
		
		SaloonDTO saloonDTO=new SaloonDTO();
		saloonDTO.setId(saloon.getId());
		saloonDTO.setSallonName(saloon.getSallonName());
		saloonDTO.setAddress(saloon.getAddress());
		saloonDTO.setCity(saloon.getCity());
		saloonDTO.setEmail(saloon.getEmail());
		saloonDTO.setPhoneNumber(saloon.getPhoneNumber());
		saloonDTO.setCloseTime(saloon.getCloseTime());
		saloonDTO.setOpenTime(saloon.getOpenTime());
		saloonDTO.setAddress(saloon.getAddress());
		saloonDTO.setOwnerId(saloon.getOwnerId());
		
		return;
		
		
	}

}
