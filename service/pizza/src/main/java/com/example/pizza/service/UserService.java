package com.example.pizza.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.pizza.dao.UserDAO;
import com.example.pizza.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
	UserDAO repo;
	
	public User saveUser(User user){
        UUID id  = UUID.randomUUID() ;
        user.setId(id.toString());
		return repo.save(user);
	}
	
	public List<User> retrieveAllUsers(){
		return repo.findAll();
	}
	
	public User updateUser(String id, User user)  {
		
		Optional<User> userOpt = repo.findById(id);
		
		if(!userOpt.isPresent()) {
			return null;
		}
			
		User _user = userOpt.get();
		_user.setDisplayName(user.getDisplayName());
		_user.setNumber(user.getNumber());
		_user.setAdress(user.getAdress());
		
		repo.save(_user);
		
		return _user;
	}
	
	public void deleteUserById(String id) {
		repo.deleteById(id);
	}
}
