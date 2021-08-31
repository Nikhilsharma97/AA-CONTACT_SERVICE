package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contacts;

@Repository
public interface ContactRepository extends MongoRepository<Contacts, String> {

	List<Contacts> findByUserId(String userId);

}
