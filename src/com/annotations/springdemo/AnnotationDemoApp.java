package com.annotations.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Reminder theReminder=context.getBean("theDanceStudio",Reminder.class);
        System.out.println(theReminder.getReminder());
        System.out.println(theReminder.getDailyBonusPoints());
        context.close();
    }
}
