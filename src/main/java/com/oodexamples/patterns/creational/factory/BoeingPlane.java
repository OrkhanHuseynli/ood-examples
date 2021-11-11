package com.oodexamples.patterns.creational.factory;

import com.oodexamples.modules.BoeingStandardEngine;
import com.oodexamples.patterns.creational.builder.models.PassengerWings;
import com.oodexamples.modules.BoeingEngine;
import lombok.Data;

@Data
public class BoeingPlane {
    private String model;
    private PassengerWings wings;
    private BoeingEngine engine;

    public BoeingPlane make(){
        this.model = "Standard";
        this.wings = new PassengerWings();
        this.engine = new BoeingStandardEngine();
        return this;
    }

    public void fly(){
        make();
        System.out.println("Boeing " + this.model + " is flying");
    }


}
