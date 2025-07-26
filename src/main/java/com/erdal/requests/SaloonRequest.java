package com.erdal.requests;



import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaloonRequest {
	
	
	private Long id;
	
	
	private String saloonName;
	
	
	private List<String> images;
	

	private String address;
	
	
	private String phoneNumber;
	
	
	private String email;
	
	
	private String city;
	
	
	private String ownerId;
	
	
	private LocalTime openTime;
	
	
	private LocalTime closeTime;
	
	

}
