package com.company;

public class OvenTurnedOn implements OvenState{
    private Oven oven;

    public OvenTurnedOn(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void turnOn() {
        System.out.println("Nothing changed it was already on");
    }

    @Override
    public void turnOff() {
        System.out.println("You turned the oven off");
        oven.setState(new OvenTurnedOff(oven));
    }
}
