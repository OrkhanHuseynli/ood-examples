package com.oodexamples.patterns.structural.flyweight;

import com.oodexamples.modules.BoeingEngine;
import com.oodexamples.modules.BoeingEngineA;
import lombok.Data;

@Data
public class PrivateJetX {

    // Intrinsic state: data which is same for all instances
    private final int maxSpeed = 100;
    private final String fuelType = "diesel";
    private final BoeingEngine engine = new BoeingEngineA();

    // Extrinsic state: data (locations) is stored separately
    // thus we keep our instances lightweight, instead  of carrying
    // all those varying data with themselves
    public String getCurrentLocation(int id, String[] locations){
        // some operations to get right location
        return locations[id];
    }
}
