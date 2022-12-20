package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	String[] fortunes = {"Fortune1", "Fortune2", "Fortune3"};

	public RandomFortuneService() {
		super();
	}

	@Override
	public String getFortune() {
		Random rnd = new Random();
		return fortunes[Math.abs(rnd.nextInt()%3)];
	}
	
	
}
