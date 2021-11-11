package com.oodexamples.patterns.behavioral.iterator;

import com.oodexamples.patterns.structural.composite.AirBus735;
import com.oodexamples.patterns.structural.composite.Boeing737;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        var boeings = new Boeing737[]{new Boeing737(),new Boeing737(), new Boeing737()};
        var airbuses = new ArrayList<AirBus735>();
        airbuses.add(new AirBus735());
        airbuses.add(new AirBus735());

        var airforce = new AirForce();
        airforce.setBoeingPlanes(boeings);
        airforce.setAirBusPlanes(airbuses);


        var iterator = airforce.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.Next());
        }

    }

}
