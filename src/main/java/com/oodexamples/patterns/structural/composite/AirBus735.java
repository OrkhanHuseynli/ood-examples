package com.oodexamples.patterns.structural.composite;

import com.oodexamples.modules.AirCraft;

public class AirBus735 implements AirCraft, AirlinePart {

    @Override
    public void fly() {

    }

    @Override
    public int getCrewCount() {
        return 15;
    }
}
