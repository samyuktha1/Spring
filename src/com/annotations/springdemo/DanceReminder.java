package com.annotations.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theDanceStudio")
public class DanceReminder implements Reminder {

    @Autowired
    private BonusPoints bonusPoints;

    //define a default constructor
    public DanceReminder()
    {
        System.out.println("Inside constructor");
    }

    //define a setter method
//    @Autowired
//    public void doSomeCrazyStuff(BonusPoints theBonusPoints)
//    {
//        System.out.println("Inside doSomeCrazyStuff");
//        bonusPoints=theBonusPoints;
//    }

    //constructor injection
//    @Autowired
//    public DanceReminder(BonusPoints theBonusPoints)
//    {
//        bonusPoints=theBonusPoints;
//    }
    @Override
    public String getReminder() {
        return "Common its time to Dance";
    }

    @Override
    public String getDailyBonusPoints() {
        return bonusPoints.getBonusPoints();
    }
}
