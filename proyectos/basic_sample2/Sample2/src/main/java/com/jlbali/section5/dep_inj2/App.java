package com.jlbali.section5.dep_inj2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


// Setter Injection.

public class App {

	public static void main(String[] args) {
		

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_depInj2.xml");
		// retrieve bean from Spring container.
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods on the bean.
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		// close the context.
		context.close();
	}

}
