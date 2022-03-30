package com.app.core.service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.dao.UserRepository;
import com.app.core.pojos.User;
import com.app.core.pojos.UserRole;
@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getAllMembers() {
		//to return all members
		return userRepo.findByRole(UserRole.MEMBER);
	}
	

	@Override
	public List<User> getAllTrainers() {
		// //to return all trainers
		return userRepo.findByRole(UserRole.TRAINER);
	}

	@Override
	public List<User> getAllLocalAdmins() {
		////to return all localAdmins
		return userRepo.findByRole(UserRole.LOCAL_ADMIN);
	}

	@Override
	public User register(User user) {
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

	@Override
	public User updateUser(User user) {
		
		return userRepo.save(user);
	}
	
}
