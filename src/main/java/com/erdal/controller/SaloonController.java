package com.erdal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erdal.DTO.SaloonDTO;
import com.erdal.DTO.UserDTO;
import com.erdal.model.Saloon;
import com.erdal.requests.SaloonRequest;
import com.erdal.service.SaloonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/saloons")
@RequiredArgsConstructor
public class SaloonController {
	
	private final SaloonService saloonService;
	
	
@PostMapping
public ResponseEntity<SaloonRequest> createSaloon(@RequestBody SaloonRequest saloonRequest){
	 UserDTO userDTO=new UserDTO();
	 userDTO.setId(1L);
	 
	 Saloon saloon=saloonService.createSaloon(saloonRequest, userDTO);
	 
	 return ResponseEntity.ok(saloon);
	
}
	
	

}
