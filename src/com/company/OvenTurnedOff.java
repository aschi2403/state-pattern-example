package com.company;

public class OvenTurnedOff implements OvenState{
    private Oven oven;

    public OvenTurnedOff(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void turnOn() {
        System.out.println("Oven turned on");
        oven.setState(new OvenTurnedOn(oven));
    }

    @Override
    public void turnOff() {
        System.out.println("Nothing changed it was already off");
    }
}
