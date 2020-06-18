//Elena Voinu

package com.springdemo;

public class CricketCoach implements  Coach{

    private FortuneService fortuneService;

    //add new fields
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;

    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;

    }

    // no argument constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg constructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    //setter injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: Inside setter method");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
