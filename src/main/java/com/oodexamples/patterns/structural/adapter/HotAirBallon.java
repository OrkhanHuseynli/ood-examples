package com.oodexamples.patterns.structural.adapter;

public class HotAirBallon {

    String gasUsed = "Hellium";

    void fly(String gasUsed){
        System.out.println("HotAirBalloon is flying");
    }

    String getGasUsed(){
        return  gasUsed;
    }
}
