package com.rchab.gof.chain.test4;

public class JustUpperHandler extends RequestHandler {

    public JustUpperHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(String request) {
        System.out.println("Just upper string: " + request);
    }

    @Override
    protected boolean isAppropriateRequest(String request) {
        return request.equals(request.toUpperCase());
    }
}
