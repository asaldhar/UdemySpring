package com.springtraining;

public class TrackCoach implements Coach
{
    private FortuneService fortuneService;
    
    public TrackCoach()
    {
        System.out.println("In TrackCoach no-arg constructor");
    }
    
    public TrackCoach(FortuneService fortuneService)
    {
        System.out.println("In TrackCoach arg constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        // TODO Auto-generated method stub
        return "A hard run needed";
    }

    @Override
    public String getDailyFortune()
    {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }
    
    // Add init method
    public void doMyStartupStuff()
    {
        System.out.println("In TrackCoach inside init method");
    }
    
    // Add destroy method
    public void doMyCleanupStuff()
    {
        System.out.println("In TrackCoach inside destroy method");
    }

}
