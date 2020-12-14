package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.ContactDTO;

import lombok.Data;

public @Data class Contact {
	
	private int id;
	private String name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;
	
	public Contact(int id, ContactDTO contactDTO) {
		super();
		this.id = id;
		this.name = contactDTO.name;
		this.address = contactDTO.address;
		this.city = contactDTO.city;
		this.state = contactDTO.state;
		this.zip = contactDTO.zip;
		this.phoneNumber = contactDTO.phoneNumber;
		this.email = contactDTO.email;
	}
}
