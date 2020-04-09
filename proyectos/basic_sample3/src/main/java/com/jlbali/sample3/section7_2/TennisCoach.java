package com.jlbali.sample3.section7_2;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice with the ball";
	}

}
