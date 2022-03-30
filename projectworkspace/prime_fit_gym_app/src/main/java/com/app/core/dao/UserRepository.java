package com.app.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.core.pojos.User;
import com.app.core.pojos.UserRole;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByRole(UserRole role);
}
