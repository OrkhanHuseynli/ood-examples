package com.oodexamples.patterns.structural.decorator;


import com.oodexamples.patterns.creational.builder.models.IAircraft;

public class Client {

    public static void main(String[] args){
        IAircraft airBusPlane = new AirBusPlane();
        IAircraft luxuryAirBus = new AirBusLuxuryDecorator(airBusPlane);
        IAircraft updatedEngine = new AirBusRollsRoyceEngineDecorator(luxuryAirBus);

        updatedEngine.fly();

    }
}
