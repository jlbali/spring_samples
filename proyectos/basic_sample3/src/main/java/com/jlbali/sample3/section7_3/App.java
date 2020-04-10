package com.jlbali.sample3.section7_3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Dependency injection with Autowired.

public class App {

	public static void main(String[] args) {
		// read Spring context file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_7_3.xml"); 
		// Get the bean.
		Coach coach = context.getBean("tennisCoach", Coach.class);
		// Call a method on the bean.
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyForunte());
		// close the context.
		context.close();
	}

}
