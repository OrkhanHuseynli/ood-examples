package com.oodexamples.patterns.structural.bridge;

public class TeslaModelXAsia extends AbstractCarModel {
    public TeslaModelXAsia(){
        this.setModel("modelX Asia");
    }

    @Override
    public boolean isRightHanded(){
        return true;
    }

    @Override
    public boolean isElectric(){
        return true;
    }
}
