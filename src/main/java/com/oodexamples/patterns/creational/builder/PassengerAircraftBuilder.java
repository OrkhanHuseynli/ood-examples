package com.oodexamples.patterns.creational.builder;

import com.oodexamples.patterns.creational.builder.models.Bathroom;
import com.oodexamples.patterns.creational.builder.models.IAircraft;
import com.oodexamples.patterns.creational.builder.models.PassengerAircraft;
import com.oodexamples.patterns.creational.builder.models.PassengerWings;

public class PassengerAircraftBuilder extends AbstractAircraftBuilder {

    private PassengerAircraft aircraft;

    PassengerAircraftBuilder(){
        aircraft = new PassengerAircraft();
    }

    @Override
    public void buildWings(){
        this.aircraft.setWings(new PassengerWings());
    }

    @Override
    public void buildBathroom(){
        this.aircraft.setBathroom(new Bathroom());
    }

    public IAircraft getResult() {
        return this.aircraft;
    }

}
