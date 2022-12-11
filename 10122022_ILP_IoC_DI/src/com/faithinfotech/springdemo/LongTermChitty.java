package com.faithinfotech.springdemo;

public class LongTermChitty implements Chitty {
	
	private FortuenService fortuneService;
	
	public LongTermChitty(FortuenService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		
		return"Deposit an amount of 2000 for a period of 14 months";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

}
