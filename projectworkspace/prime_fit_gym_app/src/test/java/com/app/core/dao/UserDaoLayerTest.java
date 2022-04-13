package com.app.core.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.core.pojos.User;

@SpringBootTest
public class UserDaoLayerTest {
	@Autowired
	private UserRepository userRepo;
	 
	
	@Test
	void testValidateUser() {
		
		User validateUser = userRepo.validateUser("super@gmail.com", "super");
		
		System.out.println(validateUser);
		
		assertEquals("Girish", validateUser.getFirstName());
	}

}
