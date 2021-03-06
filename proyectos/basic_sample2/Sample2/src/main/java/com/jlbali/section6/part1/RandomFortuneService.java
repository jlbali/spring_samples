package com.jlbali.section6.part1;

import java.util.Random;


public class RandomFortuneService implements FortuneService {

	private Random random = new Random();
	private String[] fortunes = {"Good", "Awesome", "Great"};
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
