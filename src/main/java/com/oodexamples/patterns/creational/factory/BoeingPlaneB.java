package com.oodexamples.patterns.creational.factory;

import com.oodexamples.modules.BoeingEngineB;

public class BoeingPlaneB extends BoeingPlane {

    @Override
    public BoeingPlane make(){
        super.make();
        this.setModel("B");
        this.setEngine(new BoeingEngineB());
        return this;
    }
}
