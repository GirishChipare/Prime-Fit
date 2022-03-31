package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity{
	
	    @NotEmpty(message = "First Name can't be blank")
	    @Length(min = 3, max = 20, message = "Invalid First Name length!!!!")
	    @Column(length = 20, nullable = false)
	    private String firstName;
	    
	    @Column(length = 20, nullable = false)
	    @NotEmpty(message = "Last Name can't be blank")
		@Length(min = 3, max = 20, message = "Invalid Last Name length!!!!")
	    private String lastName;
	    
	    @NotEmpty(message = "email must be supplied")
	    @Column(length = 30, nullable = false, unique = true)
	    private String email;
	    
	    @Column(length = 20, nullable = false)
	    @NotEmpty(message = "password must be supplied")
	    private String password;
	    
	    @Transient
		@JsonIgnore
		private String confirmPassword;
	    

		@Column(length = 20)
		private String locality;
		
		@Column(length = 20)
		private String city;
		
		@Column(length = 20)
		private String state;
		
		@Column(length = 10)
		private int zipCode;
	    
	    @Column(length = 20)
	    private int phone;
	    
	    @JoinTable(name = "user_roles")
	    @Enumerated(EnumType.STRING)
	    private UserRole role;
	   
	

}
