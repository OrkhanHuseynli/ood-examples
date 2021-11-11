package com.oodexamples.patterns.structural.adapter;

import com.oodexamples.modules.AirCraft;

public class Adapter implements AirCraft {
     HotAirBallon hotAirBallon;

    Adapter(HotAirBallon hotAirBallon){
        this.hotAirBallon = hotAirBallon;
    }

    @Override
    public void fly() {
        hotAirBallon.fly("hellium gas");
    }

}
