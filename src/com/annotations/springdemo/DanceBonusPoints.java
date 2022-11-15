package com.annotations.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DanceBonusPoints implements BonusPoints{

    @Override
    public String getBonusPoints()
    {
        return("Wohoo 100 points for Dance Class");
    }
}
