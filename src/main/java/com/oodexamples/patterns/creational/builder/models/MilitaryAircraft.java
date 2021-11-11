package com.oodexamples.patterns.creational.builder.models;

import lombok.Data;

@Data
public class MilitaryAircraft implements IAircraft {
    MilitaryWings wings;

    @Override
    public void fly() {

    }
}
