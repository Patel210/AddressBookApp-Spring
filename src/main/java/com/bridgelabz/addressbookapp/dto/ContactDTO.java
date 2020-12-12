package com.bridgelabz.addressbookapp.dto;

public class ContactDTO {
	public String name;
	public String address;
	
	public ContactDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ContactDTO [name=" + name + ", address=" + address + "]";
	}
}
