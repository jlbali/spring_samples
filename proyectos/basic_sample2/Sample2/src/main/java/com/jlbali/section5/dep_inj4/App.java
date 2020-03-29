package com.jlbali.section5.dep_inj4;

import org.springframework.context.support.ClassPathXmlApplicationContext;


// Properties File injection.

public class App {

	public static void main(String[] args) {
		

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_depInj4.xml");
		// retrieve bean from Spring container.
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods on the bean.
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println("Email: " + coach.getEmailAddress() );
		System.out.println("Team: " + coach.getTeam() );
		// close the context.
		context.close();
	}

}
