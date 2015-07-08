package com.rchab.gof.chain.test7;

public class Request {

    private String name;
    private RequestType type;

    public Request(String name, RequestType type) {
        this.name = name;
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
