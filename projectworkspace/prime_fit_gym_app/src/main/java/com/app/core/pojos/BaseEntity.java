package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
//@Getter
//@Setter
@Data

public class BaseEntity extends Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "First Name can't be blank")
	@Length(min = 3, max = 20, message = "Invalid First Name length!!!!")
	@Column(length = 30)
	private String firstName;

	@Column(length = 20, unique = true)
	@NotEmpty(message = "Last Name can't be blank")
	@Length(min = 3, max = 20, message = "Invalid Last Name length!!!!")
	private String lastName;
	
	private int mobileNumber;
	@Column(length = 30)
	@NotEmpty(message = "location must be supplied")
	private String email;
	
	@Column(length = 30)
	@NotEmpty(message = "location must be supplied")
	private String password;
	
	@Column(length = 50)
	private Address address;
	
	



}



