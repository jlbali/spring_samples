package com.jlbali.section5.dep_inj;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_depInj.xml");
		// retrieve bean from Spring container.
		Coach coach = context.getBean("myCoach", Coach.class);
		// call methods on the bean.
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		// close the context.
		context.close();
	}

}
