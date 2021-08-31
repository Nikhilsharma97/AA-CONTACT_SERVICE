package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Contacts;

public interface ContactService {
	
	public List<Contacts> getContactOfUsers(String userId);

	public void saveData(Contacts contacts);

}
