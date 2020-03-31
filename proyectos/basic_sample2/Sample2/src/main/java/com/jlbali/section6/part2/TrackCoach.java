package com.jlbali.section6.part2;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: " + this.fortuneService.getFortune();
	}

	public void doMyInitStuff() {
		System.out.println("TrackCoach: Startup");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: Destroy");
	}
	
}
