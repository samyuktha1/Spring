package com.demo.springDemo;

public class WaterReminder implements Reminder {

    private BonusPoints bonusPoints;

    public WaterReminder()
    {

    }

    public String getReminder()
    {
        return "Drink water its been 30 mins";
    }

    public WaterReminder(BonusPoints bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    @Override
    public String getDailyBonusPoints() {
        return "Water Bonus "+bonusPoints.getBonusPoints();
    }

    //add an init method

    public void myWaterRemiderStart()
    {
        System.out.println("Water Reminder starts now");
    }

    //add a destory method

    public void myWaterReminderEnds()
    {
        System.out.println("Water Reminder ends now");
    }

}
