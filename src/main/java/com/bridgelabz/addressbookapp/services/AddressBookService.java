package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<Contact> getContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact(1, new ContactDTO("Vishal Gupta", "13, Malta Road")));
		return contacts;
	}

	@Override
	public Contact getContactById(int contactId) {
		Contact contact =  new Contact(contactId, new ContactDTO("Vishal Gupta", "13, Malta Road"));
		return contact;
	}

	@Override
	public Contact addContact(ContactDTO contactDTO) {
		Contact contact =  new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public Contact updateContact(ContactDTO contactDTO) {
		Contact contact =  new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {
		// TODO Auto-generated method stub
		
	}

}
