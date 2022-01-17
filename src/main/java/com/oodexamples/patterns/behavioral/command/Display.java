package com.oodexamples.patterns.behavioral.command;

public class Display implements IDisplay{

    private int brightness = 0;
    private String[] viewMode = new String[]{"default", "night", "day"};
    private int viewModeCount = 1;

    @Override
    public void increaseBrightness() {
        this.brightness++;
    }

    @Override
    public void decreaseBrightness() {
        this.brightness--;
    }

    @Override
    public void switchViewMode() {
        this.viewModeCount++;
        this.viewModeCount%=3;
    }

    @Override
    public int getBrightness() {
        return this.brightness;
    }

    public String getViewModeCount() {
        return this.viewMode[viewModeCount-1];
    }
}
