package com.annotations.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DrivingReminder implements Reminder {
    @Override
    public String getReminder() {
        return "It's time for driving class";
    }

    @PostConstruct
    public void reminderStarts()
    {
        System.out.println("Reminder starts");
    }

    @PreDestroy
    public void reminderEnds()
    {
        System.out.println("Reminder ends");
    }
    @Override
    public String getDailyBonusPoints() {
        return null;
    }
}
