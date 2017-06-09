package com.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope-springConfig.xml");
        Coach objA = (Coach) context.getBean("myBaseballCoach", Coach.class);
        Coach objB = (Coach) context.getBean("myBaseballCoach", Coach.class);
        boolean result = (objA == objB);
        System.out.println("The objects are pointing to the same instance :"+result);
        System.out.println("Memory location for ojbA:"+objA);
        System.out.println("Memory location for ojbB:"+objB);
        
    }

}
