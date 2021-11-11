package com.oodexamples.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Airline implements AirlinePart {

    List<AirlinePart> planes = new ArrayList<>();

    public  void add(AirlinePart part){
        planes.add(part);
    }

    @Override
    public int getCrewCount() {
        var count = 0;

        for (int i = 0; i<planes.size(); i++){
             count+=planes.get(i).getCrewCount();
        }
        return count;
    }
}
