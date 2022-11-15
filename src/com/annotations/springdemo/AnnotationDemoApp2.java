package com.annotations.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp2 {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Reminder theReminder=context.getBean("drivingReminder",Reminder.class);
        System.out.println(theReminder.getReminder());
        context.close();
    }
}
