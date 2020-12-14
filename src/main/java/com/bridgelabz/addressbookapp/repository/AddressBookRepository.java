package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookapp.model.Contact;

public interface AddressBookRepository extends JpaRepository<Contact, Integer> {

}
