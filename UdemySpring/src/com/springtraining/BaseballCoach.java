package com.springtraining;

public class BaseballCoach implements Coach
{
    private FortuneService fortuneService;
    
    public BaseballCoach()
    {
        System.out.println("Baseball coach no-arg constructor");
    }
    
    public BaseballCoach(FortuneService fortuneService)
    {
        System.out.println("Baseball coach constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Run for 30 mins on a daily basis";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

}
