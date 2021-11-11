package com.oodexamples.patterns.structural.composite;

import com.oodexamples.modules.AirCraft;

public class Boeing737 implements AirCraft, AirlinePart {
    @Override
    public void fly() {

    }

    @Override
    public int getCrewCount() {
        return 10;
    }
}
