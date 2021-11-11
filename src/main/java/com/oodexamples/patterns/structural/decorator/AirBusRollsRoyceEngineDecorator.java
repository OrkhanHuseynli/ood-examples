package com.oodexamples.patterns.structural.decorator;

import com.oodexamples.patterns.creational.builder.models.IAircraft;

public class AirBusRollsRoyceEngineDecorator extends AirBusDecorator implements IAircraft {
    private IAircraft airBusPlane;

    public AirBusRollsRoyceEngineDecorator(IAircraft airBusPlane){
        this.airBusPlane = airBusPlane;
    }

    private void turboAccelerate(){
        System.out.println("turbo acceleration");
    }

    @Override
    public void fly() {
        turboAccelerate();
        airBusPlane.fly();
    }
}
