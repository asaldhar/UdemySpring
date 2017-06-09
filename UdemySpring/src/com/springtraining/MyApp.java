package com.springtraining;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MyApp
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"springConfig.xml"});
        Coach obj = (Coach) context.getBean("myBaseballCoach", Coach.class);
        System.out.println(obj.getDailyWorkout());
        System.out.println(obj.getDailyFortune());
    }
}