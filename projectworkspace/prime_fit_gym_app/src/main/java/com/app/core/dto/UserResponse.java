package com.app.core.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	//private String password;
	private int phone;
	private String address;
	private Set<String> roles =new HashSet<>();
	
	

}
