package com.rchab.gof.chain.test;

public class LongRequestHandler extends RequestHandler {

    public LongRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected boolean isAppropriate(Number request) {
        return request instanceof Long;
    }

    @Override
    protected void executeRequest(Number request) {
        System.out.println(request.longValue() * 5);
    }
}
