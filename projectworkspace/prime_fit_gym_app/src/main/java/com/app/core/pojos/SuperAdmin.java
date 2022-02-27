package com.app.core.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "super_admin")
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class SuperAdmin extends BaseEntity{
	
//	@NotEmpty(message = "First Name can't be blank")
//	@Length(min = 4, max = 20, message = "Invalid First Name length!!!!")
//	@Column(length = 30)
//	private String firstName;
//
//	@Column(length = 20, unique = true)
//	@NotEmpty(message = "Last Name can't be blank")
//	@Length(min = 4, max = 20, message = "Invalid Last Name length!!!!")
//	private String lastName;
//	
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
