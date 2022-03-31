package com.app.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.core.pojos.User;
import com.app.core.pojos.UserRole;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select u from User u where u.email=:mail and u.password=:pwd")
	Optional<User> validateUser(@Param("mail")String mail,@Param("pwd")String pwd);
	
	List<User> findByRole(UserRole role);
}
