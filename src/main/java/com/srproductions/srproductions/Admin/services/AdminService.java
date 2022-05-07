package com.srproductions.srproductions.Admin.services;

import com.srproductions.srproductions.Admin.models.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface AdminService extends MongoRepository<Admin, String> {
    
}
