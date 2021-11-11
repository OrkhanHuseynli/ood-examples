package com.oodexamples.patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new HotAirBallon());
        adapter.fly();
    }
}
