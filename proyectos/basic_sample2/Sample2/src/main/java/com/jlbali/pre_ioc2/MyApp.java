package com.jlbali.pre_ioc2;

//Inversion of Control Example.


public class MyApp {

	public static void main(String[] args) {
		// Create the coach
		//Coach coach = new BaseballCoach();
		Coach coach = new TrackCoach();
		// Use the Coach
		System.out.println(coach.getDailyWorkout());
		
	}

}
