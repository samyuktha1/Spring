package com.demo.springDemo;

public class MyApp {
    public static void main (String args[])
    {
        Reminder theReminder = new DanceReminder(); //created object
        Reminder theReminder2 = new WaterReminder();
        System.out.println(theReminder.getReminder()); //used the object
        System.out.println(theReminder2.getReminder());
    }
}
