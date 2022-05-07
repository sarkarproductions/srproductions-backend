package com.srproductions.srproductions.FormSubmission.services;

import com.srproductions.srproductions.FormSubmission.model.Users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends MongoRepository<Users, String> {
    
}
