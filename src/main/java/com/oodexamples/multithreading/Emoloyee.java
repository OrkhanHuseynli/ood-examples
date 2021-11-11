package com.oodexamples.multithreading;

public class Emoloyee {
    private String name;

    public synchronized void setName(String name){
        this.name = name;
    }

    public synchronized void resetName(){
        this.name = "";
    }

    // equivalent of adding synchronized in method
    // definition
    public String getName() {
        synchronized (this) {
            return this.name;
        }
    }
}
