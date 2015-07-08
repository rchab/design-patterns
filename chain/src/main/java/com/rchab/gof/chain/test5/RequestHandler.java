package com.rchab.gof.chain.test5;

public abstract class RequestHandler {

    private RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(String request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        } else {
            delegate(request);
        }
    }

    private void delegate(String request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Unhandled request: " + request);
        }
    }

    protected abstract void executeRequest(String request);

    protected abstract boolean isAppropriateRequest(String request);
}
