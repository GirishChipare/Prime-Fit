package com.app.core.pojos;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class NutritionPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dietId;
	
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
