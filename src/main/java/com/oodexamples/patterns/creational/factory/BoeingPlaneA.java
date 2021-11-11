package com.oodexamples.patterns.creational.factory;

import com.oodexamples.modules.BoeingEngineA;

public class BoeingPlaneA extends BoeingPlane {
    @Override
    public BoeingPlane make(){
        super.make();
        this.setModel("A");
        this.setEngine(new BoeingEngineA());
        return this;
    }
}
