package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
	
	
	    @Column(length = 20, nullable = false)
	    private String firstName;
	    
	    @Column(length = 20, nullable = false)
	    private String lastName;
	    
	    @Column(length = 30, nullable = false, unique = true)
	    private String email;
	    
	    @Column(length = 20, nullable = false)
	    private String password;
	    
	    @Enumerated(EnumType.STRING)
	    @Column(length = 20)
	    private Role role;
	    
	    @Column(length = 20)
	    private String phone;

	    public User() {
	        System.out.println("in ctor of "+getClass().getName());
	    }

}
