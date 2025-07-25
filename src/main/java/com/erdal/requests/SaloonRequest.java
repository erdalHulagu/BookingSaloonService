package com.erdal.requests;



import java.time.LocalTime;
import java.util.List;
import lombok.Data;

@Data
public class SaloonRequest {
	
	
	private Long id;
	
	
	private String sallonName;
	
	
	private List<String> images;
	

	private String address;
	
	
	private String phoneNumber;
	
	
	private String email;
	
	
	private String city;
	
	
	private String ownerId;
	
	
	private LocalTime openTime;
	
	
	private LocalTime closeTime;
	
	

}
