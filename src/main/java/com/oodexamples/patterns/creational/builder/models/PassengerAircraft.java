package com.oodexamples.patterns.creational.builder.models;

import lombok.Data;

@Data
public class PassengerAircraft implements IAircraft {
    private PassengerWings wings;
    private Bathroom bathroom;

    @Override
    public void fly() {

    }
}
