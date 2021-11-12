package com.oodexamples.patterns.behavioral.responsibilitychain;

public class AbstractHandler implements Handler {
    private int requestCode;
    private AbstractHandler next;
    public AbstractHandler(int requestCode, AbstractHandler nextHandler){
        this.requestCode = requestCode;
        this.next = nextHandler;
    }
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestCode() == this.requestCode){
            System.out.println("Your case was handled by "+this.getClass().getName());
        }else {
            if(this.next!=null){
                this.next.handleRequest(request);
            }else {
                System.out.println("!!! The case was not handled !!! ");
            }
        }
    }
}
