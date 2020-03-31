package com.jlbali.section6.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


// Bean Scopes.

public class App {

	public static void main(String[] args) {
		

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_section6_2.xml");
		// retrieve bean from Spring container. Singleton.
		Coach coach = context.getBean("myCoachSingleton", Coach.class);

		// close the context.
		context.close();
	}

}
