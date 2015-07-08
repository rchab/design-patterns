package com.rchab.gof.chain.test6;

public class HighPriorityRequestHandler extends RequestHandler {

    public HighPriorityRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(Request request) {
        System.out.println("Request with high priority: " + request);
    }

    @Override
    protected boolean isAppropriateHandler(Request request) {
        return request.getType().equals(RequestType.HIGH);
    }
}
