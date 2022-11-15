package com.demo.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String args[])
    {
        //load the spring config file

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container

        DriveReminder theReminder= context.getBean("myDriveReminder",DriveReminder.class);
        //call methods on the bean

        System.out.println(theReminder.getReminder());

        System.out.println(theReminder.getDailyBonusPoints());

        //call our new methods
        System.out.println(theReminder.getName());
        System.out.println(theReminder.getEmailid());
        //close the context

        context.close();
    }
}
