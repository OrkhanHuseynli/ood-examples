package com.oodexamples.patterns.behavioral.iterator;


import com.oodexamples.modules.AirCraft;
import com.oodexamples.patterns.structural.composite.AirBus735;
import com.oodexamples.patterns.structural.composite.Boeing737;
import java.util.List;

public class AirForceIterator implements Iterator<AirCraft> {

    private Boeing737[] boeingPlanes;
    private List<AirBus735> airBusPlanes;
    private int boeingPosition = 0;
    private int airBusPosition = 0;

    public AirForceIterator(AirForce airForce){
        this.boeingPlanes = airForce.getBoeingPlanes();
        this.airBusPlanes = airForce.getAirBusPlanes();
    }

    @Override
    public AirCraft Next() {
        if(boeingPosition<this.boeingPlanes.length){
            return this.boeingPlanes[boeingPosition++];
        }
        if(airBusPosition<this.airBusPlanes.size()){
            return  this.airBusPlanes.get(airBusPosition++);
        }
        throw new RuntimeException("No more elements");
    }

    @Override
    public boolean hasNext() {
        return boeingPosition<this.boeingPlanes.length || airBusPosition<this.airBusPlanes.size();
    }

}
