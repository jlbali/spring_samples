package com.jlbali.dep_inj;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your good day!";
	}

}
