package com.oodexamples.patterns.behavioral.command;

public class ControlPanel {
    Command [] commands = new Command[2];

    public void setCommand(int i, Command command){
        this.commands[i] = command;
    }

    public void speedUp(){
        commands[0].execute();
    }

    public void brightnessUp(){
        commands[1].execute();
    }
}
