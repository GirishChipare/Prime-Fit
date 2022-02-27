package com.app.core.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "member")
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Member extends BaseEntity {


	@ManyToOne
	@JoinColumn(name="trainer_id",nullable = false)
	private Trainer trainer;
	
	@ManyToOne
	@JoinColumn(name = "local_admin_id",nullable = false)
	private LocalAdmin localAdmin;
	
	@ManyToOne
	@JoinColumn(name = "super_admin_id",nullable = false)
	private SuperAdmin superAdmin;
	
	@ManyToOne
	@JoinColumn(name = "branch",nullable = false)
	private GymBranch branch;
	
	@OneToOne
	@JoinColumn(name="payment_id", nullable = false)
	private Payment payment;
	
	
	
}
