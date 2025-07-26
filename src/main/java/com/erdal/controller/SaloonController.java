package com.erdal.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erdal.DTO.SaloonDTO;
import com.erdal.DTO.UserDTO;
import com.erdal.mapper.SaloonMapper;
import com.erdal.model.Saloon;
import com.erdal.requests.SaloonRequest;
import com.erdal.responseMessage.SaloonResponse;
import com.erdal.responseMessage.SaloonResponseMessage;
import com.erdal.service.SaloonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/saloons")
@RequiredArgsConstructor
public class SaloonController {

	private final SaloonService saloonService;

	@PostMapping
	public ResponseEntity<SaloonDTO> createSaloon(@RequestBody SaloonRequest saloonRequest) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1L);

		Saloon saloon = saloonService.createSaloon(saloonRequest, userDTO);
		SaloonDTO saloonDTO = SaloonMapper.mapToSaloonDTO(saloon);

		return ResponseEntity.ok(saloonDTO);

	}

	@PatchMapping("/{saloonId}")
	public ResponseEntity<SaloonDTO> updateSaloon(@RequestBody SaloonRequest saloonRequest,@PathVariable Long saloonId) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1L);

		Saloon saloon = saloonService.updateSaloon(saloonRequest, userDTO, saloonId);
		SaloonDTO saloonDTO = SaloonMapper.mapToSaloonDTO(saloon);

		return ResponseEntity.ok(saloonDTO);

	}

	@GetMapping("/allSaloons")
	public ResponseEntity<List<SaloonDTO>> getSaloons() {

		List<Saloon> saloons = saloonService.getAllSaloon();

		List<SaloonDTO> saloonDTOs = SaloonMapper.mapAllListToSaloonDTO(saloons);

		return ResponseEntity.ok(saloonDTOs);

	}
	@GetMapping("{saloonId}")
	public ResponseEntity<SaloonDTO> getSaloonById(@PathVariable Long saloonId) {
		
		Saloon saloon = saloonService.getSaloonById(saloonId);
		
		SaloonDTO saloonDTO = SaloonMapper.mapToSaloonDTO(saloon);
		
		return ResponseEntity.ok(saloonDTO);
		
	}
	@GetMapping("/search")
	public ResponseEntity<List<SaloonDTO>> searchAllSaloonsByCity(@RequestParam("city") String city) {
		
		List<Saloon> saloons = saloonService.searchSaloonByCityName(city);
		
		List<SaloonDTO> saloonDTOs = SaloonMapper.mapAllListToSaloonDTO(saloons);
		
		return ResponseEntity.ok(saloonDTOs);
		
	}
	
	@GetMapping
	public ResponseEntity<SaloonDTO> getSaloonByOwnerId() {
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1L);
		Saloon saloon= saloonService.getSaloonByOwnerId(userDTO.getId());
		
		SaloonDTO saloonDTOs = SaloonMapper.mapToSaloonDTO(saloon);
		
		return ResponseEntity.ok(saloonDTOs);
		
	}
	@DeleteMapping
	public SaloonResponse deleteSaloonByOwnerId() {
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1L);
		
		saloonService.deleteSaloonByOwnerId(userDTO.getId());
		
		 return new SaloonResponse(SaloonResponseMessage.SALOON_REMOVED);
	}

}
