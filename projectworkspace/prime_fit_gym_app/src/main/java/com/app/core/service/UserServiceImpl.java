package com.app.core.service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.dao.UserRepository;
import com.app.core.pojos.User;
@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getAllUsers() {
		//to return all users irrespective of roles
		return userRepo.findAll();
	}

	@Override
	public User registerorUpdateUser(User user) {
		//to register or save the user details 
		return userRepo.save(user);
	}

	@Override
	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(userId);
		 return "User Details with Id "+userId+ "deleted successfully";
	}

	@Override
	public User getUserDetails(int userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId)
				.orElseThrow(() -> new NoSuchElementException("User by Id "+userId+" not found"));
	}
	
	
}
