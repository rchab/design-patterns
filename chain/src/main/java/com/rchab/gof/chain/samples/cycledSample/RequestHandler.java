package com.rchab.gof.chain.samples.cycledSample;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Number request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        }
        delegateRequestToNext(request);
    }

    public abstract boolean isAppropriateRequest(Number request);

    public abstract void executeRequest(Number request);

    private void delegateRequestToNext(Number request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
