package com.jlbali.section5.dep_inj2;


public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Workout for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
