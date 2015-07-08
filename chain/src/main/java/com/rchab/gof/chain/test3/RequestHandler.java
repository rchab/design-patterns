package com.rchab.gof.chain.test3;

public abstract class RequestHandler {

    private RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    protected void handleRequest(Request request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        } else {
            delegateRequest(request);
        }

    }

    private void delegateRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Unhandled request: " + request.getContent());
        }
    }

    protected abstract void executeRequest(Request request);

    protected abstract boolean isAppropriateRequest(Request request);
}
