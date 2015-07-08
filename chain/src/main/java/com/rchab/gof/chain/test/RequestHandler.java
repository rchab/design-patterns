package com.rchab.gof.chain.test;

public abstract class RequestHandler {

    private RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Number request) {
        if (isAppropriate(request)) {
            executeRequest(request);
        } else {
            delegateRequest(request);
        }
    }

    private void delegateRequest(Number request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Unhandled request: " + request.toString());
        }

    }

    protected abstract boolean isAppropriate(Number request);

    protected abstract void executeRequest(Number request);

}
