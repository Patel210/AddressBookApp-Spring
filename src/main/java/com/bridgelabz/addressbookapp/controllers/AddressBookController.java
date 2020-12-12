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

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = {"", "/", "/get"}) 
	public ResponseEntity<String> getContacts() {
		return new ResponseEntity<String>("Get Call Success!", HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Get Call Success for ID: " + contactId, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addContact(@RequestBody ContactDTO contactDTO) {
		return new ResponseEntity<String>("Created Contact for: " + contactDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}")
	public ResponseEntity<String> updateContact(@PathVariable("contactId") int contactId, 
												@RequestBody ContactDTO contactDTO) {
		return new ResponseEntity<String>("Updated Contact for: " + contactDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<String> deleteContact(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Delete Call Success for ID: " + contactId, HttpStatus.OK);
	}
}
