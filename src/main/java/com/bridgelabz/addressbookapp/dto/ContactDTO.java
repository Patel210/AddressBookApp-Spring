package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

public @Data class ContactDTO {
	public String name;
	public String address;
	
	public ContactDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}
