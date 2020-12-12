package com.bridgelabz.addressbookapp.controllers;

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

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = {"", "/", "/get"}) 
	public ResponseEntity<ResponseDTO> getContacts() {
		Contact contact = null;
		contact = new Contact(1, new ContactDTO("Vishal Gupta", "13, Malta Road"));
		ResponseDTO responseDTO =  new ResponseDTO("Get Call Success!", contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("contactId") int contactId) {
		Contact contact = null;
		contact = new Contact(1, new ContactDTO("Vishal Gupta", "13, Malta Road"));
		ResponseDTO responseDTO =  new ResponseDTO("Get Call Success for ID: " + contactId, contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addContact(@RequestBody ContactDTO contactDTO) {
		Contact contact = null;
		contact = new Contact(1, contactDTO);
		ResponseDTO responseDTO =  new ResponseDTO("Added Contact Successfully!", contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDTO> updateContact(@PathVariable("contactId") int contactId, 
												@RequestBody ContactDTO contactDTO) {
		Contact contact = null;
		contact = new Contact(contactId, contactDTO);
		ResponseDTO responseDTO =  new ResponseDTO("Updated Contact Successfully!", contact);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("contactId") int contactId) {
		ResponseDTO responseDTO =  new ResponseDTO("Deleted Successfully!", "Deleted ID: " + contactId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}
