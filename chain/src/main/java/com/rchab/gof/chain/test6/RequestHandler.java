package com.rchab.gof.chain.test6;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (isAppropriateHandler(request)) {
            executeRequest(request);
        } else {
            delegateRequest(request);
        }
    }

    private void delegateRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Unhandled request " + request);
        }
    }

    protected abstract void executeRequest(Request request);

    protected abstract boolean isAppropriateHandler(Request request);

}
