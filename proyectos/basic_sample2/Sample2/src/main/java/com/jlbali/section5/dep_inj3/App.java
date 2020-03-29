package com.jlbali.section5.dep_inj3;

import org.springframework.context.support.ClassPathXmlApplicationContext;


// Literal Values Injection.

public class App {

	public static void main(String[] args) {
		

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_depInj3.xml");
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
