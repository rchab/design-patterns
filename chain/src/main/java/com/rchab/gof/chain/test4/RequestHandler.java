package com.rchab.gof.chain.test4;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(String request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        } else {
            delegateRequestToNext(request);
        }
    }

    private void delegateRequestToNext(String request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Unhandled request " + request);
        }
    }


    protected abstract void executeRequest(String request);

    protected abstract boolean isAppropriateRequest(String request);
}
