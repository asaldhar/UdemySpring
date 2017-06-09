package com.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp
{

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-springConfig.xml");
        Coach objA = (Coach) context.getBean("myTrackCoach", Coach.class);
        System.out.println(objA.getDailyWorkout());
        context.close();
    }

}
