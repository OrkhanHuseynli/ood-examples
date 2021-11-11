package com.oodexamples.patterns.structural.bridge;

public class TeslaModelXAmerica extends AbstractCarModel{

    public TeslaModelXAmerica(){
        this.setModel("modelX America");
    }

    @Override
    public boolean isRightHanded(){
        return false;
    }

    @Override
    public boolean isElectric(){
        return true;
    }

}
