package com.oodexamples.patterns.creational.prototype;

import com.oodexamples.modules.BoeingEngine;

public class BoeingAircraft implements AircraftPrototype {

    private BoeingEngine engine;
    public void fly(){
        System.out.println("Boing is flying!");
    }

    public AircraftPrototype clone(){
        return new BoeingAircraft();
    }

    @Override
    public void setEngine(BoeingEngine engine) {
        this.engine = engine;
    }
}
