package com.jlbali.section5.dep_inj5;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your good day!";
	}

}
