package com.oodexamples.patterns.structural.bridge;

import lombok.Data;

@Data
public abstract class AbstractCar {
    private AbstractCarModel carModel;

    public AbstractCar(AbstractCarModel carModel){
        this.carModel = carModel;
    }

    public boolean isRightHanded(){
        return carModel.isRightHanded();
    }

    public boolean isElectric(){
        return carModel.isElectric();
    }


    public void drive(){

        System.out.println(this.carModel.getModel() + " is moving");
    }
}
