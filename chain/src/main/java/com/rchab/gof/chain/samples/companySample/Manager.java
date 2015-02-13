package com.rchab.gof.chain.samples.companySample;

public class Manager extends RequestHandler {

    public Manager(RequestType type, RequestHandler handler){
        super(type, handler);
    }

    @Override
    public void executeRequest(Request request) {
        System.out.println("Manager drink tea first");
        System.out.println(this + " handle " + request);
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
