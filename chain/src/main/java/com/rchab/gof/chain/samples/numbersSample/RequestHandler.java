package com.rchab.gof.chain.samples.numbersSample;

import java.util.Random;

public class RequestHandler {

    RequestHandler next;
    String name;
    Random random;

    public RequestHandler(String name) {
        this.name = name;
        random = new Random(3);
    }

    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(String request) {
        if (isFree()) {
            executeRequest(request);
        } else {
            delegateRequestToNext(request);
        }
    }

    private boolean isFree() {
        boolean isFree = random.nextInt(2) == 0;
        System.out.println(name + " is free = " + isFree);
        return isFree;
    }

    private void executeRequest(String request) {
        System.out.println(name + " handled " + request);
    }

    public void delegateRequestToNext(String request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
