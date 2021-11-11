package com.oodexamples.patterns.structural.decorator;

import com.oodexamples.patterns.creational.builder.models.IAircraft;

public class AirBusLuxuryDecorator extends AirBusDecorator  implements  IAircraft {

    private IAircraft airBusPlane;

    public AirBusLuxuryDecorator(IAircraft airBusPlane){
        this.airBusPlane = airBusPlane;
    }

    private void displayLuxuryPanels(){
        System.out.println("luxury panels");
    }

    @Override
    public void fly() {
        this.displayLuxuryPanels();
        airBusPlane.fly();
    }
}
