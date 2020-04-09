package com.jlbali.sample3.section7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Example of Java Annotations for Spring Beans.

public class App {

	public static void main(String[] args) {
		// read Spring context file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		// Get the bean.
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		// Call a method on the bean.
		System.out.println(coach.getDailyWorkout());
		// close the context.
		context.close();
	}

}
