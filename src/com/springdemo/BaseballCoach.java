package com.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "30 Minuten Schlaguebung";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService
		return fortuneService.getFortune();
	}
}
