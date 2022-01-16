package com.oodexamples.patterns.structural.proxy;

import com.oodexamples.modules.AirCraft;

public class AirplaneProxy implements AirCraft {
    @Override
    public void fly() {
        // forward request to real Airplane to fly
    }
}

/*
Real example for Proxy pattern:
java.rmi.* package contains classes for creating proxies. RMI is Remote Method Invocation.
 */
