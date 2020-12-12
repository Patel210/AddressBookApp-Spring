package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.ContactDTO;

import lombok.Data;

public @Data class Contact {
	
	private int id;
	private String name;
	private String address;
	
	public Contact(int id, ContactDTO contactDTO) {
		super();
		this.id = id;
		this.name = contactDTO.name;
		this.address = contactDTO.address;
	}
}
