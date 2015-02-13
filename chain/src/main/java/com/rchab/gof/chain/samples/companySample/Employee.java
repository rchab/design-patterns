package com.rchab.gof.chain.samples.companySample;

public class Employee extends RequestHandler {

    protected Employee(RequestType type, RequestHandler next) {
        super(type, next);
    }

    @Override
    public void executeRequest(Request request) {
        System.out.println("Employee drink beer first");
        System.out.println(this + " handle " + request);
    }

    @Override
    public String toString() {
        return "Employee";
    }
}
