package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contacts;
import com.example.demo.service.ContactService;



@RestController
@RequestMapping("/contacts")
public class ContactsController {
	
	
	@Autowired
	private ContactService contactService;
	
	
	@PostMapping("/add-data")
	public String saveData(@RequestBody Contacts contacts) {
		
		contactService.saveData(contacts);
		return "Added data with name is : " + contacts.getContactName();
	}

	
	@GetMapping("/find/{userId}")
	public List<Contacts> getContactOfUsers(@PathVariable String userId) {
		return contactService.getContactOfUsers(userId);
	}

}
