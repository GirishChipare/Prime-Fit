package com.app.core.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Table(name = "workout_plan")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkoutPlan extends BaseEntity{

	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int workoutId;
	
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
