package com.rchab.gof.chain.samples.companySample;

public class Director extends RequestHandler{

    protected Director(RequestType type, RequestHandler next) {
        super(type, next);
    }

    @Override
    public void executeRequest(Request request) {
        System.out.println("Director drink coffee first");
        System.out.println(this + " handle " + request);
    }

    @Override
    public String toString() {
        return "Director";
    }
}
