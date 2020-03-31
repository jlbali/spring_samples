package com.jlbali.section6.part1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


// Bean Scopes.

public class App {

	public static void main(String[] args) {
		

		// Load the Spring configuration file.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext_section6_1.xml");
		// retrieve bean from Spring container. Singleton.
		Coach coach1 = context.getBean("myCoachSingleton", Coach.class);
		Coach coach2 = context.getBean("myCoachSingleton", Coach.class);
		// Check equality of both singletons,
		System.out.println("Equal: " + (coach1==coach2));
		// retrieve bean from Spring container. Prototype.
		coach1 = context.getBean("myCoachPrototype", Coach.class);
		coach2 = context.getBean("myCoachPrototype", Coach.class);
		// Check equality of both singletons,
		System.out.println("Equal: " + (coach1==coach2));

		// close the context.
		context.close();
	}

}
