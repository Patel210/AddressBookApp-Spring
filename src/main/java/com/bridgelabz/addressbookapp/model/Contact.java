package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.ContactDTO;

public class Contact {
	
	private int id;
	private String name;
	private String address;
	
	public Contact() {
		super();
	}
	
	public Contact(int id, ContactDTO contactDTO) {
		super();
		this.id = id;
		this.name = contactDTO.name;
		this.address = contactDTO.address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
