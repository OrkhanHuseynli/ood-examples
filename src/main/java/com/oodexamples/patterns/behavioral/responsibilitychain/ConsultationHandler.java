package com.oodexamples.patterns.behavioral.responsibilitychain;

public class ConsultationHandler extends AbstractHandler{
    public ConsultationHandler(AbstractHandler nextHandler) {
        super(RequestCodes.CONSULTATION_CODE.getRequestCode(), nextHandler);
    }
}
