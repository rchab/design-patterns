package com.rchab.gof.chain.test4;

public class JustLowerHandler extends RequestHandler {

    public JustLowerHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(String request) {
        System.out.println("Lower case string handled: " + request);
    }

    @Override
    protected boolean isAppropriateRequest(String request) {
        return request.toLowerCase().equals(request);
    }
}
