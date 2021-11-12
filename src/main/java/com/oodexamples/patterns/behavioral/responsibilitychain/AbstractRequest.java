package com.oodexamples.patterns.behavioral.responsibilitychain;

public class AbstractRequest implements Request {
    private int requestCode;

    public AbstractRequest(int requestCode){
        this.requestCode = requestCode;
    }
    @Override
    public int getRequestCode() {
        return this.requestCode;
    }
}
