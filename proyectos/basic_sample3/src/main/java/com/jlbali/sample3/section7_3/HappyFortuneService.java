package com.jlbali.sample3.section7_3;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Everything going to be ok";
	}

}
