package com.jlbali.section5.dep_inj2;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;

	public CricketCoach() {
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice a lot each day";
	}


	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
