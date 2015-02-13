package com.rchab.gof.chain.samples.companySample;

public class Request {

    private RequestType type;

    public Request(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Request with type = " + type;
    }
}
