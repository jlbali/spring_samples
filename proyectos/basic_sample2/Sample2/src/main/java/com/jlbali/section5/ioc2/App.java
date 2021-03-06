package com.jlbali.section5.ioc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from Spring container.
		Coach coach = context.getBean("myCoach", Coach.class);
		// call methods on the bean.
		System.out.println(coach.getDailyWorkout());
		// close the context.
		context.close();
	}

}
