package com.oodexamples.patterns.creational.builder;

import com.oodexamples.patterns.creational.builder.models.IAircraft;
import com.oodexamples.patterns.creational.builder.models.MilitaryAircraft;
import com.oodexamples.patterns.creational.builder.models.MilitaryWings;

public class MilitaryAircraftBuilder extends AbstractAircraftBuilder {

    private MilitaryAircraft aircraft;

    MilitaryAircraftBuilder(){
        aircraft = new MilitaryAircraft();
    }

    @Override
    public void buildWings(){
        aircraft.setWings(new MilitaryWings());
    }

    @Override
    public IAircraft getResult() {
        return this.aircraft;
    }

}
