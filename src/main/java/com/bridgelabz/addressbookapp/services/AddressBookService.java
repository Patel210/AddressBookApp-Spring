package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;

@Service
public class AddressBookService implements IAddressBookService {
	
	private List<Contact> addressBook = new ArrayList<Contact>();

	@Override
	public List<Contact> getContacts() {
		return addressBook;
	}

	@Override
	public Contact getContactById(int contactId) {
		return addressBook.stream()
						  .filter(contact -> contact.getId() == contactId)
						  .findFirst()
						  .orElseThrow(() -> new AddressBookException("Contact Not Found"));
	}

	@Override
	public Contact addContact(ContactDTO contactDTO) {
		Contact contact =  new Contact(addressBook.size() + 1, contactDTO);
		addressBook.add(contact);
		return contact;
	}

	@Override
	public Contact updateContact(int contactId, ContactDTO contactDTO) {
		Contact contact =  this.getContactById(contactId);
		contact.setName(contactDTO.name);
		contact.setAddress(contactDTO.address);
		addressBook.set(contactId - 1, contact);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {
		Contact contact =  this.getContactById(contactId);
		addressBook.remove(contactId - 1);
		
	}

}
