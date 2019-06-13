package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //interface
    private FortuneService fortuneService;

    //applicationContext injects HappyFortuneService class
    //because it shared FortuneService Interface
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "\nSpend 32 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();

    }

}
