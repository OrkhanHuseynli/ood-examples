package com.oodexamples.patterns.structural.decorator;

import com.oodexamples.patterns.creational.builder.models.IAircraft;

public class AirBusPlane implements IAircraft {

    @Override
    public void fly() {
        System.out.println("AirBusPlane is flying");
    }
}
