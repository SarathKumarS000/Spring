package com.faithinfotech.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		//retrieve bean from spring container
		Chitty theCoach = context.getBean("myCoach",Chitty.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
