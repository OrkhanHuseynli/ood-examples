package com.oodexamples.patterns.structural.bridge;

public class Client {
    public static void main(String[] args){
        var teslaX1 = new Tesla(new TeslaModelXAmerica());
        var teslaX2 = new Tesla(new TeslaModelXAsia());

        teslaX1.drive();
        teslaX2.drive();

    }
}
