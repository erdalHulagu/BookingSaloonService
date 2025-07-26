package com.erdal.model;

import java.time.LocalTime;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Saloon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String saloonName;
	
	@ElementCollection
	private List<String> images;
	
	@Column(nullable = false)
	private String address;
	
	
	@Column(nullable = false)
	private String phoneNumber;
	
	
	@Column(nullable = false)
	private String email;
	
	
	@Column(nullable = false)
	private String city;
	
	
	@Column(nullable = false)
	private  Long ownerId;
	
    @DateTimeFormat
	private LocalTime openTime;
	
	
//	@Column(nullable = false)
    @DateTimeFormat
	private LocalTime closeTime;
	
	

}
