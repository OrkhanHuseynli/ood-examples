package com.oodexamples.patterns.structural.flyweight;

public class Client {

    public static void main(String[] args){
        PrivateJetX jet1 = new PrivateJetX();
        PrivateJetX jet2 = new PrivateJetX();

        String[] locations = new String[]{"Berlin", "Amsterdam", "New York"};

        jet1.getCurrentLocation(0, locations);
        jet2.getCurrentLocation(1, locations);

    }
}