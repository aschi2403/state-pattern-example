package com.company;

public class OvenTurnedOff implements OvenState{
    @Override
    public void turnOn(Oven oven) {
        System.out.println("Oven turned on");
        oven.setState(new OvenTurnedOn());
    }

    @Override
    public void turnOff(Oven oven) {
        System.out.println("Nothing changed it was already off");
    }
}
