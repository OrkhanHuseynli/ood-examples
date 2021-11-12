package com.oodexamples.patterns.behavioral.responsibilitychain;

public enum RequestCodes {
    CONSULTATION_CODE(1),
    TECH_SUPPORT_CODE(2);

    private final int requestCode;

    private RequestCodes(int requestCode) {
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
