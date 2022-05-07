package com.srproductions.srproductions.Admin.controller;

import java.util.Optional;

import com.srproductions.srproductions.Admin.models.Admin;
import com.srproductions.srproductions.Admin.models.ResponseMessage;
import com.srproductions.srproductions.Admin.services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://sarkaragency.netlify.app/"})
public class AdminController {

    @Autowired
    private AdminService adminService;

    private ResponseMessage responseMessage;

    @PostMapping("/api/login")
    public ResponseEntity<?> getAdmin(@RequestBody Admin admin){
        String email = admin.getEmail();
        String password = admin.getPassword();
        try{
            Optional<Admin> adminData =  this.adminService.findById(email);
            Admin user = adminData.get();
            if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(adminData);
            }
            else{
                responseMessage = new ResponseMessage();
                responseMessage.setType("Unauthorized");
                responseMessage.setMessage("Incorrect Credentials");
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMessage);   
            }
        }
        catch(Exception e){}
        responseMessage = new ResponseMessage();
        responseMessage.setType("Unauthorized");
        responseMessage.setMessage("Incorrect Credentials");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMessage);   
            
    }

    // @PostMapping("/api/login")
    // public ResponseEntity<?> postAdmin(@RequestBody Admin admin){
    //     this.adminService.save(admin);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(admin);
    // }
    
}
