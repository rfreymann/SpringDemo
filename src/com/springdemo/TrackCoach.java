package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "30 Minuten laufen";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	// add init Method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach starting up");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach destroyed up");
	}

}
