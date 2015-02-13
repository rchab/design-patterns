package com.rchab.gof.chain.templetes.basicTemplete;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        } else {
            delegateRequestToNext(request);
        }
    }

    //Methods for concrete handlers:
    public abstract boolean isAppropriateRequest(Request request);

    public abstract void executeRequest(Request request);

    private void delegateRequestToNext(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
