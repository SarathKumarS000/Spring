package com.faithinfotech.springdemo;

public class ShortTermChitty implements Chitty {
	
	
	private String id;
	private String name;
	private FortuenService fortuneService;
	
    public String getid() {
	return id;
    }


	public void setid(String id) {
		System.out.println("Inside Long term chitty there is a discount available");
		this.id = id;
	}


	public String getname() {
		return name;
	}


	public void setname(String name) {
		System.out.println("Select a chitty category");
		this.name = name;
	}
	
	public ShortTermChitty() {
		
		System.out.println("Following are the chitties available: ");
	}
	
	
	public void setFortuneService(FortuenService fortuneService) {
		System.out.println("You can select an option to join the chitty");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		
		return"Deposit an amount of 1000 for a period of 3 months";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
