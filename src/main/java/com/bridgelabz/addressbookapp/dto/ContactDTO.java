package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

public @Data class ContactDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}([\\s][A-Z]{1}[a-z]{2,})?$", message = "Person Name Invalid")
	public String name;

	@Pattern(regexp = "^[A-Za-z0-9,\\.]{3,}([\\s][A-Za-z0-9,\\.]{3,}){0,}$", message = "Person Address Invalid")
	public String address;

	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "City Invalid")
	public String city;

	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "State Invalid")
	public String state;

	@Range(min = 100000, max = 999999, message = "Invalid Zip")
	public int zip;

	@Pattern(regexp = "^(([+])?[0-9]{2}[\\s]){0,1}[1-9]{1}[0-9]{9}$", message = "Person Phone Number Invalid")
	public String phoneNumber;

	@Email(message = "Invalid Email")
	public String email;

	public ContactDTO(String name, String address, String city, String state, int zip, String phoneNumber,
					  String email) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

}
