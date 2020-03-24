package com.company;

public class OvenTurnedOn implements OvenState{
    @Override
    public void turnOn(Oven oven) {
        System.out.println("Nothing changed it was already on");
    }

    @Override
    public void turnOff(Oven oven) {
        System.out.println("You turned the oven off");
        oven.setState(new OvenTurnedOff());
    }
}
