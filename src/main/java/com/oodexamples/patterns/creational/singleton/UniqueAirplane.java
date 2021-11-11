package com.oodexamples.patterns.creational.singleton;

public class UniqueAirplane {
    private  static UniqueAirplane airplane;
    private UniqueAirplane() {
    }

    public static UniqueAirplane getInstance(){
        if (airplane == null) {
            airplane = new UniqueAirplane();
        }
        return airplane;
    }
}
