package com.company;

public class Oven {
    private OvenState state = new OvenTurnedOff();

    public OvenState getState() {
        return state;
    }

    public void setState(OvenState state) {
        this.state = state;
    }

    public void turnOn(){
        state.turnOn(this);
    }

    public void turnOff(){
        state.turnOff(this);
    }
}
