package com.oodexamples.patterns.creational.factory;

import java.util.ArrayList;
import java.util.Collection;

class Client {
    public static void main(String[] args){
        Collection<BoeingPlane> planes = new ArrayList<>();
        planes.add(new BoeingPlaneA());
        planes.add(new BoeingPlaneB());

        for (BoeingPlane boeingPlane: planes){
            boeingPlane.fly();
        }
    }
}
