package com.oodexamples.patterns.creational.builder;

public class Director {
    AbstractAircraftBuilder builder;

    Director(AbstractAircraftBuilder builder){
        this.builder = builder;
    }


    public void construct(boolean isPassenger) {
        this.builder.buildWings();
        if(isPassenger){
            this.builder.buildBathroom();
        }
    }
}
