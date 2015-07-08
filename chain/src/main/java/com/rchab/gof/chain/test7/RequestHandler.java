package com.rchab.gof.chain.test7;

public abstract class RequestHandler {

    private RequestHandler nextHandler;
    private RequestType requestType;

    protected RequestHandler(RequestHandler nextHandler, RequestType requestType) {
        this.nextHandler = nextHandler;
        this.requestType = requestType;
    }

    protected RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        } else {
            delegateRequest(request);
        }
    }

    protected void delegateRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Unhandled request: " +  request);
        }

    }

    protected abstract void executeRequest(Request request);

    private boolean isAppropriateRequest(Request request) {
        return request.getType().equals(requestType);
    }
}
