package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

                                //id: myCoach, interface: Coach.class
        //Coach theCoach = context.getBean("myCricketCoach",Coach.class);
       CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //theCoach = context.getBean("myBaseballCoach",Coach.class);
        //System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach.getDailyFortune());

        //theCoach = context.getBean("myTrackCoach",Coach.class);
        //System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach.getDailyFortune());

        context.close();

    }


}
