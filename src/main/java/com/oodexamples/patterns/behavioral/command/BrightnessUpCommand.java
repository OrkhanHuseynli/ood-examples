package com.oodexamples.patterns.behavioral.command;

public class BrightnessUpCommand implements Command {

    IDisplay receiver;
    public BrightnessUpCommand(IDisplay display){
        this.receiver = display;
    }

    @Override
    public void execute() {
        this.receiver.increaseBrightness();
        System.out.println("Current brightness: " + this.receiver.getBrightness());
    }
}
