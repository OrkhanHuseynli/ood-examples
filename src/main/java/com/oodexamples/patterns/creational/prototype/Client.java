package com.oodexamples.patterns.creational.prototype;

import com.oodexamples.modules.BoeingEngineA;
import com.oodexamples.modules.BoeingEngineB;

public class Client {
    public void main(){
        AircraftPrototype prototype = new BoeingAircraft();
        var aircraft1 = prototype.clone();
        aircraft1.setEngine(new BoeingEngineA());

        var aircraft2 = prototype.clone();
        aircraft2.setEngine(new BoeingEngineB());
    }
}
