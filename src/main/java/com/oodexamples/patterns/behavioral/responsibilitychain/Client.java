package com.oodexamples.patterns.behavioral.responsibilitychain;

public class Client {
    public static void main(String[] args){
        var techSupportHandler = new TechnicalSupportHandler(null);
        var consultationHandler = new ConsultationHandler(techSupportHandler);

        // define a request
        var techSupportRequest = new TechnicalSupportRequest(RequestCodes.TECH_SUPPORT_CODE.getRequestCode());

        // we pass a request not knowing who will handle it
        consultationHandler.handleRequest(techSupportRequest);
    }
}

