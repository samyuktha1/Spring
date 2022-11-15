package com.demo.springDemo;

public class DanceReminder implements Reminder {

    //define a private field for dependency

    private BonusPoints bonusPoints;

    public  DanceReminder()
    {

    }

    //define a constructor for dependency injection

    public DanceReminder(BonusPoints theBonusPoints){
        bonusPoints=theBonusPoints;
    }
    @Override
    public String getReminder() {
        return "It's time to Dance";
    }

    @Override
    public String getDailyBonusPoints() {

        //use my bonusPoints to get bonus points

        return bonusPoints.getBonusPoints();
    }
}
