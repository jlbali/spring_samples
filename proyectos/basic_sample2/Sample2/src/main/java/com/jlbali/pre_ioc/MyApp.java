package com.jlbali.pre_ioc;

//Inversion of Control Example.


public class MyApp {

	public static void main(String[] args) {
		// Create the coach
		BaseballCoach coach = new BaseballCoach();
		// Use the Coach
		System.out.println(coach.getDailyWorkout());
		
	}

}
