package com.example.pizza.API;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.example.pizza.model.User;
import com.example.pizza.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/user")
@RestController
public class UserController {

    @Autowired
	UserService userService;

	@PostMapping("/create")
	public String saveUser(@RequestBody User user, HttpServletRequest request) {
		try {
			// save to MongoDB database
			User _user = userService.saveUser(user);
			
			String message = "Upload Successfully a User to MongoDB with id = " + _user.getId();
			return message;	
		}catch(Exception e) {
			String message = "Can NOT upload  a User to MongoDB database";
			return message;
		}
    }
    
    
	
	@GetMapping("/retrieveinfos")
	public List<User> getAllUsers(HttpServletRequest request) {
		
			// get all documents from MongoDB database
			List<User> users = userService.retrieveAllUsers();			
			return users;	
		
	}

	@PutMapping("/updatebyid/{id}")
	public String updateUser(@PathVariable String id, @RequestBody User user,
															HttpServletRequest request) {
		
			// update a customer to MongoDB
			userService.updateUser(id, user);
			String message = "Successfully Update a user to MongoDB with id = " + id;
			
			return message;
		
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteUserById(@PathVariable String id, HttpServletRequest request) {

			// delete a Customer from MongoDB database using ID
			userService.deleteUserById(id);
			
			String message = "Successfully delete a user from MongoDB database with id = " + id;
			return message;
		
	} 
}
