package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
			
		// retrieve beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
