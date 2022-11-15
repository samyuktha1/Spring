package com.annotations.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String args[])
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext("ReminderConfig.class");
        Reminder theReminder=context.getBean("reminderConfig",Reminder.class);
        System.out.println(theReminder.getReminder());
        System.out.println(theReminder.getDailyBonusPoints());
        context.close();
    }
}
