package com.srproductions.srproductions.FormSubmission.controller;

import java.util.List;

import com.srproductions.srproductions.FormSubmission.model.Users;
import com.srproductions.srproductions.FormSubmission.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://sarkaragency.netlify.app/"})
public class FormController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/api/formsubmission")
    public ResponseEntity<?> submit(@RequestBody Users users){
        this.userService.save(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

    @GetMapping("/api/formsubmission")
    public ResponseEntity <List<Users>> getAllusers(){
        List<Users> res = this.userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
