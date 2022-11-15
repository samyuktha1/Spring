package com.annotations.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Reminder theReminder=context.getBean("drivingReminder",Reminder.class);
        Reminder theNextReminder=context.getBean("drivingReminder",Reminder.class);
        boolean result=(theReminder==theNextReminder);
        System.out.println("Are they same "+result);
        System.out.println("Memory location "+theReminder);
        System.out.println("Memory location next reminder "+theNextReminder);
        context.close();
    }
}
