package com.demo.springDemo;

public class DanceBonusPoints implements BonusPoints {
    @Override
    public String getBonusPoints()
    {
        return "You received 100 bonus points";
    }
}
