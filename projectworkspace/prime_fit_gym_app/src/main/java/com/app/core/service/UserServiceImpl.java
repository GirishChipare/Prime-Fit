package com.app.core.service;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.dao.RoleRepository;
import com.app.core.dao.UserRepository;
import com.app.core.dto.SignUpRequest;
import com.app.core.dto.UserResponse;
import com.app.core.pojos.Role;
import com.app.core.pojos.User;
import com.app.core.pojos.UserRole;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RoleRepository roleRepo;
	
	@Override
	public UserResponse registerUser(SignUpRequest request) {
		User user= new User();
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setPhone(request.getPhone());
		user.setAddress(request.getAddress());
		Set<Role> roles=request.getRoles().stream()//convert Set<String> : role names ---> Stream<String>
				//mapping roleName --> Role (using RoleRepo) 	
				.map(roleName->roleRepo.findByUserRole(UserRole.valueOf(roleName)).get())
				//collect in a Set<Role>
				.collect(Collectors.toSet());
		user.setRoles(roles);
		User persistentUser=userRepo.save(user);//persisted user details in db
		UserResponse dto =new UserResponse();
		BeanUtils.copyProperties(persistentUser, dto);//for sending resp : copied User--->User resp DTO
		
		return dto;
	}

}
