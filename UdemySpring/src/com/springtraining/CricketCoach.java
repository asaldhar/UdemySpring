package com.springtraining;

public class CricketCoach implements Coach
{
    public FortuneService fortuneService;
    private String emailAddress;
    private String team;
    
    public void setEmailAddress(String emailAddress)
    {
        System.out.println("In email Setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team)
    {
        System.out.println("In team Setter");
        this.team = team;
    }
    
    public String getEmailAddress()
    {
        return emailAddress;
    }
    
    public String getTeam()
    {
        return team;
    }

    public CricketCoach()
    {
        System.out.println("Cricket coach no-arg constructor!");
    }

    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("Cricket coach setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        // TODO Auto-generated method stub
        return "Practice fast bowling 15 mins a day";
    }

    @Override
    public String getDailyFortune()
    {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }
    
}
