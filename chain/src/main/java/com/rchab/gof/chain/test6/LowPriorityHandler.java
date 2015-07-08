package com.rchab.gof.chain.test6;

public class LowPriorityHandler extends RequestHandler {

    public LowPriorityHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(Request request) {
        System.out.println("Request with low priority is executed " + request);
    }

    @Override
    protected boolean isAppropriateHandler(Request request) {
        return request.getType().equals(RequestType.LOW);
    }
}
