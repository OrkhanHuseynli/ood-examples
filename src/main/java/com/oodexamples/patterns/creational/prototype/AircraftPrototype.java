package com.oodexamples.patterns.creational.prototype;

import com.oodexamples.modules.BoeingEngine;

public interface AircraftPrototype {

    void fly();

    AircraftPrototype clone();

    void setEngine(BoeingEngine engine);
}
