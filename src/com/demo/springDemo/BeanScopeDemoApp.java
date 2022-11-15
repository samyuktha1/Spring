package com.demo.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String args[])
    {
        //load spring from config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //retrieve bean from spring container
        Reminder theReminder=context.getBean("myReminder",Reminder.class);
        Reminder waterReminder=context.getBean("myReminder",Reminder.class);

        //check if they are the same beans
        boolean result=(theReminder==waterReminder);
        System.out.println("ARE THEY POINTING TO THE SAME OBJECT ?"+result);
        System.out.println("MEMORY LOCATION FOR REMINDER "+theReminder);
        System.out.println("MEMORY LOCATION FOR REMINDER "+waterReminder);

        //close the context

        context.close();

    }
}
