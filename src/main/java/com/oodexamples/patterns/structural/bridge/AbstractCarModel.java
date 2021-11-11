package com.oodexamples.patterns.structural.bridge;

import lombok.Data;

@Data
public abstract class AbstractCarModel {
    private String model;

    public boolean isRightHanded(){
        return true;
    }

    public boolean isElectric(){
        return false;
    }

}
