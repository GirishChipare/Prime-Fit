package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter

public class Address {
	
	@Column(length = 20)
	private String locality;
	
	@Column(length = 20)
	private String city;
	
	@Column(length = 20)
	private String state;
	
	@Column(length = 10)
	private int zipCode;
	

}
