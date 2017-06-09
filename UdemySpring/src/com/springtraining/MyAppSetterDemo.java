package com.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSetterDemo
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"springConfig.xml"});
        CricketCoach obj = (CricketCoach) context.getBean("myCricketCoach", Coach.class);
        System.out.println(obj.getDailyWorkout());
        System.out.println(obj.getDailyFortune());
        System.out.println("The email address is :"+obj.getEmailAddress());
        System.out.println("The team is :"+obj.getTeam());
    }

}
