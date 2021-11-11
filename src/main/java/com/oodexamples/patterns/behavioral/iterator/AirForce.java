package com.oodexamples.patterns.behavioral.iterator;

import com.oodexamples.modules.AirCraft;
import com.oodexamples.patterns.structural.composite.AirBus735;
import com.oodexamples.patterns.structural.composite.Boeing737;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AirForce implements Iterable<AirCraft> {

    private Boeing737[] boeingPlanes = new Boeing737[0];
    private List<AirBus735> airBusPlanes = new ArrayList<>();

    public AirForce(){
    }

    @Override
    public Iterator<AirCraft> createIterator() {
        return new AirForceIterator(this);
    }
}
