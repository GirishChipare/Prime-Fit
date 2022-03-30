package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.dto.ResponseDTO;
import com.app.core.pojos.User;
import com.app.core.service.IUserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserService userService;

	public UserController() {
		// TODO Auto-generated constructor stub
		System.out.println("In constructor of " + getClass());
	}

	// adding request handlig method to send all the Member-users to the caller
	@GetMapping("/members")
	public List<User> getAllMembers() {
		System.out.println("in get all Users");
		return userService.getAllMembers();
	}

	@GetMapping("/trainers")
	public List<User> getAllTrainers() {
		System.out.println("in get all Users");
		return userService.getAllTrainers();
	}

	@GetMapping("/localadmins")
	public List<User> getAllLocalAdmins() {
		System.out.println("in get all Users");
		return userService.getAllLocalAdmins();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable int id) {
		System.out.println("In get User details " + id);
		return new ResponseEntity<>(userService.getUserDetails(id), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseDTO<?> addUser(@RequestBody User u) {
		System.out.println("in Add users" + u);
		User newUser = userService.register(u);
		return new ResponseDTO<>(HttpStatus.OK, "User Added Successfully", newUser);
	}

	@PutMapping("/update")
	public ResponseDTO<?> updateUser(@RequestBody User u) {
		System.out.println("In update user" + u);
		User user = userService.updateUser(u);
		return new ResponseDTO<>(HttpStatus.OK, "user updated successfully", user);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseDTO<?> deleteUser(@PathVariable int id) {
		System.out.println("in delete user " + id);
		String deleteUser = userService.deleteUser(id);
		return new ResponseDTO<>(HttpStatus.OK, "User deleted successfully", deleteUser);
	}

}
