package com.demo.springDemo;

public class DriveReminder implements Reminder {

    private BonusPoints bonusPoints;

    private String name;

    private String emailid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Drive Reminder: inside setter method for set name");
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        System.out.println("Drive Reminder: inside setter method for set email id");
        this.emailid = emailid;
    }

    public DriveReminder()
    {
        System.out.println("Drive Reminder: inside no arg");
    }

    //our setter method
    public void setBonusPoints(BonusPoints bonusPoints) {
        System.out.println("Drive Reminder: inside setter method");
        this.bonusPoints = bonusPoints;
    }

    @Override
    public String getReminder() {
        return "It's time to go for Driving Class";
    }

    @Override
    public String getDailyBonusPoints() {
        return bonusPoints.getBonusPoints() ;
    }
}
