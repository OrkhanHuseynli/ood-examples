package com.oodexamples.patterns.behavioral.command;

public interface IDisplay {
    void increaseBrightness();
    void decreaseBrightness();
    void switchViewMode();
    int getBrightness();
}
