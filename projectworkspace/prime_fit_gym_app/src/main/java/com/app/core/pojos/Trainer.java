package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trainer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trainer extends BaseEntity{
	
	private int gymId;
	
//	@NotEmpty(message = "First Name can't be blank")
//	@Length(min = 4, max = 20, message = "Invalid First Name length!!!!")
//	@Column(length = 30)
//	private String firstName;
//	
//	@Column(length = 20, unique = true)
//	@NotEmpty(message = "Last Name can't be blank")
//	@Length(min = 4, max = 20, message = "Invalid Last Name length!!!!")
//	private String lastName;
	
	@Column(length = 20, unique = true)
	@NotEmpty(message = "Branch Name can't be blank")
	private String branchName;
	
//	private int mobileNumber;
//	
//	@Column(length = 30)
//	@NotEmpty(message = "email must be supplied")
//	private String email;
//	
//	@Column(length = 30)
//	@NotEmpty(message = "password must be supplied")
//	private String password;
//	
//	@Column(length = 50)
//	private String address;
	

}
