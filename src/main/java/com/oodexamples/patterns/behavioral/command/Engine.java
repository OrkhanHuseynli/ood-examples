package com.oodexamples.patterns.behavioral.command;

public class Engine implements IEngine {

    private int speed = 0;

    @Override
    public void speedUp() {
        this.speed++;
    }

    @Override
    public void slowDown() {
        this.speed--;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }


}
