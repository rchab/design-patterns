package com.rchab.gof.chain.test;

public class IntegerRequestHandler extends RequestHandler {

    public IntegerRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected boolean isAppropriate(Number request) {
        return request instanceof Integer;
    }

    @Override
    protected void executeRequest(Number request) {
        System.out.println(request.intValue() * 2);
    }
}
