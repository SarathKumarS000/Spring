package com.faithinfotech.springdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelooStringApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Chitty theCoach;
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		System.out.print("1.Long Term, 2.Short Term, 3.Multidivision");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1: theCoach = context.getBean("longterm",Chitty.class);
				//call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				//close the context
				context.close();
				break;
		case 2: ShortTermChitty cCoach = context.getBean("shortterm",ShortTermChitty.class);
				//call methods on the bean
				System.out.println(cCoach.getDailyWorkout());
				System.out.println(cCoach.getDailyFortune());
				System.out.println(cCoach.getid());
				System.out.println(cCoach.getname());
				//close the context1
				context.close();
				break;
		case 3: theCoach = context.getBean("multidivision",Chitty.class);
				//call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				//close the context
				context.close();
				break;

		}
		
	}

}
