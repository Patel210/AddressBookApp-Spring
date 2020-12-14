package com.bridgelabz.addressbookapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.Contact;
import com.bridgelabz.addressbookapp.services.IAddressBookService;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = {"", "/", "/get"}) 
	public ResponseEntity<ResponseDTO> getContacts() {
		List<Contact> addressBook = null;
		addressBook = addressBookService.getContacts();
		ResponseDTO responseDTO =  new ResponseDTO("Get Call Success!", addressBook);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("contactId") int contactId) {
		Contact contact = null;
		contact = addressBookService.getContactById(contactId);
		ResponseDTO responseDTO =  new ResponseDTO("Get Call Success for ID: " + contactId, contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addContact(@Valid @RequestBody ContactDTO contactDTO) {
		Contact contact = null;
		contact = addressBookService.addContact(contactDTO);
		ResponseDTO responseDTO =  new ResponseDTO("Added Contact Successfully!", contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDTO> updateContact(@PathVariable("contactId") int contactId, 
												@Valid @RequestBody ContactDTO contactDTO) {
		Contact contact = null;
		contact = addressBookService.updateContact(contactId, contactDTO);
		ResponseDTO responseDTO =  new ResponseDTO("Updated Contact Successfully!", contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("contactId") int contactId) {
		addressBookService.deleteContact(contactId);
		ResponseDTO responseDTO =  new ResponseDTO("Deleted Successfully!", "Deleted ID: " + contactId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}
