package com.oodexamples.patterns.behavioral.responsibilitychain;

public class TechnicalSupportHandler extends AbstractHandler{
    public TechnicalSupportHandler(AbstractHandler nextHandler){
        super(RequestCodes.TECH_SUPPORT_CODE.getRequestCode(), nextHandler);
    }
}
