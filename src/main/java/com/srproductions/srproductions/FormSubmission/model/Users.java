package com.srproductions.srproductions.FormSubmission.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Form_Data")
public class Users {
    private String name;
    private String contact;
    @Id
    private String email;
    private String gender;
    private String address;
    private String country;
    private String describe;
    private String message;
    
    public Users() {
    }

    public Users(String name, String contact, String email, String gender, String address, String country,
            String describe, String message) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.country = country;
        this.describe = describe;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Users [address=" + address + ", contact=" + contact + ", country=" + country + ", describe=" + describe
                + ", email=" + email + ", gender=" + gender + ", message=" + message + ", name=" + name + "]";
    }

}
