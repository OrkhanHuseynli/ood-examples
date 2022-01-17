package com.oodexamples.patterns.behavioral.command;

public class Client {
    public static void main(String[] args){
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(0, new SpeedingUpCommand(new Engine()));
        controlPanel.setCommand(1, new BrightnessUpCommand(new Display()));

        controlPanel.speedUp();
        controlPanel.speedUp();
        controlPanel.speedUp();

        controlPanel.brightnessUp();
        controlPanel.brightnessUp();
        controlPanel.brightnessUp();
    }
}
