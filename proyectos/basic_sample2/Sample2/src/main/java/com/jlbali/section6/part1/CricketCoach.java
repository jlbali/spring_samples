package com.jlbali.section6.part1;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public CricketCoach() {
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice a lot each day";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
