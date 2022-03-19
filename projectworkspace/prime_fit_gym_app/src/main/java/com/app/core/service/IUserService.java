package com.app.core.service;

import java.util.List;

import com.app.core.pojos.User;

public interface IUserService {
	// getall users of the gym
	List<User> getAllUsers();

	// get all members of the gym
//	 List<User> getAllMembers(Role member);
//
//	// get all the trainers of the gym
//	 List<User> getAllTrainers(Role trainer);
//
//	// get all the localAdmins of the gum
//	 List<User> getAllLocalAdmins(Role localAdmin);

	// update user
	 User updateUser(User user);

	// register new user
	User register(User user);

	// delete user
	String deleteUser(int userId);

	// get user by id
	User getUserDetails(int userId);
	
	

}
