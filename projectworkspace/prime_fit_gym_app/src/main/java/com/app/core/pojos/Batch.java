package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Batch {
	
	@Column(name = "batch_time")
	private String batchTime;
	
	@Column(name = "batch_type")
	private BatchType batchType;
	

}
