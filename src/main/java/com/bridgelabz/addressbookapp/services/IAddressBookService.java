package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;

public interface IAddressBookService {
	List<Contact> getContacts();
	Contact getContactById(int contactId);
	Contact addContact(ContactDTO contactDTO);
	Contact updateContact(ContactDTO contactDTO);
	void deleteContact(int contactId);
	
}
