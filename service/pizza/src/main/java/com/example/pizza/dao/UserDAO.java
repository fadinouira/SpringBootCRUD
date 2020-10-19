package com.example.pizza.dao;



import com.example.pizza.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User, String> {
}
