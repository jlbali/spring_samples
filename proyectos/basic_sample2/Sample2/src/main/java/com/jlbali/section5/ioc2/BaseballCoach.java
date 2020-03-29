package com.jlbali.section5.ioc2;


public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Workout for 30 minutes";
	}
}
