package com.oodexamples.patterns.behavioral.command;

public class SpeedingUpCommand implements Command {

    IEngine receiver;

    public SpeedingUpCommand(IEngine receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.speedUp();
        System.out.println("Current speed: " + this.receiver.getSpeed());
    }
}
