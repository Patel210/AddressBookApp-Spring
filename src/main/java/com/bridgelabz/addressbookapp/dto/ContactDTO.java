package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.Pattern;


import lombok.Data;

public @Data class ContactDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}([\\s][A-Z]{1}[a-z]{2,})?$", message = "Person Name Invalid")
	public String name;
	
	@Pattern(regexp = "^[A-Za-z0-9,\\.]{3,}([\\s][A-Za-z0-9,\\.]{3,}){0,}$", message = "Person Address Invalid")
	public String address;
	
	public String city;
	public String state;
	public int zip;
	public String phoneNumber;
	public String email;
	
	public ContactDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}
