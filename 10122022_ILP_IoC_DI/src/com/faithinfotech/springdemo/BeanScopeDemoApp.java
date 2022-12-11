package com.faithinfotech.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		//retrieve bean from spring container
		Chitty theCoach = context.getBean("myCoach",Chitty.class);
		Chitty alphaCoach = context.getBean("myCoach",Chitty.class);
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\n Pointing to same object - " + result);
		System.out.println("\n Memory location for the coach is" + theCoach);
		System.out.println("\n Memory location for the coach is" + alphaCoach);
		context.close();
	}

}
