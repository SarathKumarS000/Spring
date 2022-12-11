package com.faithinfotech.springdemo;

public class HappyFortuneService implements FortuenService {

	@Override
	public String getFortune() {
		
		return "You get a 5% discount on the first installment";
	}

}
