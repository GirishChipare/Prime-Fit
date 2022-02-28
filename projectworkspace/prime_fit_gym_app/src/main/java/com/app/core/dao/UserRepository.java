package com.app.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.core.pojos.Role;
import com.app.core.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	// get all members of the gym
//	@Query("SELECT * FROM com.app.core.pojo.User u WHERE u.user_roles = MEMBER")
//	 List<User> getAllMembers(Role member);
//
//	// get all the trainers of the gym
	// List<User> getAllTrainers(Role trainer);
//
//	// get all the localAdmins of the gum
	// List<User> getAllLocalAdmins(Role localAdmin);
}
