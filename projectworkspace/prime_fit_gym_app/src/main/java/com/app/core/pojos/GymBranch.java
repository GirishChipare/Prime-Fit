package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gym_branch")
public class GymBranch extends BaseEntity{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int branchId;
	
	@Column(name = "branch_name")
	private String branchName;
	
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
	

}
