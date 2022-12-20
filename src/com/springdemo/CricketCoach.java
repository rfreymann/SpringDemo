package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowle";
	}
	
	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}
	
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
