package com.example.pizza.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id ;
    private String email ;
    private String password ;
    private String number ;
    private String adress ;
    private String displayName ;

    public User(String id,
    @JsonProperty("email") String email,
    @JsonProperty("password") String password,
    @JsonProperty("number") String number, 
    @JsonProperty("adress")String adress,
    @JsonProperty("displayName") String displayName) {
        this.id = id ;
        this.email = email;
        this.password = password;
        this.number = number;
        this.adress = adress;
        this.displayName = displayName;
    }

    public String getId() {
        return id  ;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }
    
    
}
