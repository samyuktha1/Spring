package com.demo.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String args[])
    {
        //load the spring configuration file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve the bean from spring container
        Reminder theReminder=context.getBean("myReminder",Reminder.class);
        //call methods on the bean
        System.out.println(theReminder.getReminder());

        //calling new method for bonus points
        System.out.println(theReminder.getDailyBonusPoints());
        //close the context
        context.close();
    }
}
