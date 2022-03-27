package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.pojos.User;
import com.app.core.service.IUserService;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	System.out.println("In constructor of "+getClass());
	}
	
	//adding request handlig method to send all the users to the caller
	@GetMapping
	public List<User> getAllUsers(){
	System.out.println("in get all Users");
	return userService.getAllUsers();
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User u) {
		System.out.println("in Add users"+u);
		return userService.register(u);
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		System.out.println("In get User details "+id);
		return userService.getUserDetails(id);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User u) {
		System.out.println("In update user"+u);
		return userService.updateUser(u);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		System.out.println("in delete user "+id);
		return userService.deleteUser(id);
	}

}
