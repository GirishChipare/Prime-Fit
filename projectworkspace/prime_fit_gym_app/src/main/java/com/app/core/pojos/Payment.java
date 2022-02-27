package com.app.core.pojos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends BaseEntity{
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "payment_date",length = 70)
	private Date paymentDate;
}