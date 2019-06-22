package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    //interface
    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;

    //Spring scan component that implements FortuneService interface
    //HappyFortuneService meets the requirement.
    public TennisCoach() {
        System.out.println("TennisCoach constructor.");
    }

    //public void doSomeCrazyStuff(FortuneService theFortuneservice) {
    //    System.out.println("Do Some Crazy Stuff");
    //    fortuneService = theFortuneservice;
    //}

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley, now.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
