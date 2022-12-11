package com.faithinfotech.springdemo;

public class TrackCoach implements Chitty {

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";		
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	//add an init method
	public void doMyStartupStuff() {
		
		System.out.println("TrackCoach: inside method domyStartupStuff");
	}
	//add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method domyCleanupStuff");	
		
	}

}
