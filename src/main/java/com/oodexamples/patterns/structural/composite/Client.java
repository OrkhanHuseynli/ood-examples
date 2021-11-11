package com.oodexamples.patterns.structural.composite;

public class Client {
    public static void main(String[] args){
       var boeing  = new Boeing737();
       var airbus = new AirBus735();
       var lufthansa = new Airline();
       var turkishAirlines = new Airline();
       var starAlliance = new Airline();


       starAlliance.add(lufthansa);
       starAlliance.add(turkishAirlines);

       for(int i = 0; i<3; i++){
           lufthansa.add(boeing);
           lufthansa.add(airbus);
       }

        for(int i = 0; i<2; i++){
            turkishAirlines.add(boeing);
            turkishAirlines.add(airbus);
        }

        System.out.println(starAlliance.getCrewCount());

    }
}
