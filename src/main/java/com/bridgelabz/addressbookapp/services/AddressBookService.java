package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	private AddressBookRepository addressBookRepository;

	@Override
	public List<Contact> getContacts() {
		return addressBookRepository.findAll();
	}

	@Override
	public Contact getContactById(int contactId) {
		if(addressBookRepository.findById(contactId).isEmpty()) {
			throw new AddressBookException("Contact Not Found");
		}
		return addressBookRepository.findById(contactId).get();
	}

	@Override
	public Contact addContact(ContactDTO contactDTO) {
		Contact contact =  new Contact(contactDTO);
		addressBookRepository.save(contact);
		return contact;
	}

	@Override
	public Contact updateContact(int contactId, ContactDTO contactDTO) {
		Contact contact =  this.getContactById(contactId);
		contact.setName(contactDTO.name);
		contact.setAddress(contactDTO.address);
		contact.setCity(contactDTO.city);
		contact.setState(contactDTO.state);
		contact.setZip(contactDTO.zip);
		contact.setPhoneNumber(contactDTO.phoneNumber);
		contact.setEmail(contactDTO.email);
		addressBookRepository.save(contact);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {
		Contact contact =  this.getContactById(contactId);
		addressBookRepository.delete(contact);
		
	}

}
