package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nutrition_plan")
public class NutritionPlan extends BaseEntity {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int dietId;
	
	@Column(name = "breakfast")
	private String breakfast;
	
	@Column(name = "meal1")
	private String meal1;
	@Column(name = "meal2")
	private String meal2;
	
	@Column(name = "meal3")
	private String meal3;
	
	@Column(name = "meal4")
	private String meal4;
}
