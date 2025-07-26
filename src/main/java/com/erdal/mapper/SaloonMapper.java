package com.erdal.mapper;

import java.util.List;
import java.util.Objects;

import com.erdal.DTO.SaloonDTO;
import com.erdal.model.Saloon;

public class SaloonMapper {

	public static SaloonDTO mapToSaloonDTO(Saloon saloon) {

		SaloonDTO saloonDTO = new SaloonDTO();
		saloonDTO.setId(saloon.getId());
		saloonDTO.setSaloonName(saloon.getSaloonName());
		saloonDTO.setAddress(saloon.getAddress());
		saloonDTO.setCity(saloon.getCity());
		saloonDTO.setEmail(saloon.getEmail());
		saloonDTO.setPhoneNumber(saloon.getPhoneNumber());
		saloonDTO.setCloseTime(saloon.getCloseTime());
		saloonDTO.setOpenTime(saloon.getOpenTime());
		saloonDTO.setAddress(saloon.getAddress());
		saloonDTO.setOwnerId(saloon.getOwnerId());

		return saloonDTO;

	}

	public static List<SaloonDTO> mapAllListToSaloonDTO(List<Saloon> saloons) {

		List<SaloonDTO> saloonDTOs = saloons.stream().map((saloon) -> {
			SaloonDTO saloonDTO = mapToSaloonDTO(saloon);
			return saloonDTO;
		}).toList();

		return saloonDTOs;
//	}
//		public static List<SaloonDTO> mapAllListToSaloonDTO(List<Saloon> saloons) {
//	    return saloons.stream()
//                .filter(Objects::nonNull) // null saloon'ları at
//                .map(SaloonMapper::mapToSaloonDTO)
//                .toList();
//		
	}
	

}
