package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contacts;
import com.example.demo.service.ContactService;
import com.example.demo.repository.ContactRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ContactServiceImpl implements ContactService{

	private final Logger log = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public List<Contacts> getContactOfUsers(String userId) {
		List<Contacts> data =contactRepository.findByUserId(userId);
		return data;
	}

	@Override
	public void saveData(Contacts contacts) {
		log.info("&&&& save contacts data {}",contacts.getcId());
		contactRepository.save(contacts);
	}

}
