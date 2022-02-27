package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "member")
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class WorkoutPlan {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int workoutId;
	
	@Column(name = "monday")
	private String mondayExercise;
	
	@Column(name = "tuesday")
	private String tuesdayExercise;
	
	@Column(name = "wednesday")
	private String wednesdayExercise;
	
	@Column(name = "thursday")
	private String thursdayExercise;
	
	@Column(name = "friday")
	private String fridayExercise;
	
	@Column(name = "saturday")
	private String saturdayExercise;
	
}
