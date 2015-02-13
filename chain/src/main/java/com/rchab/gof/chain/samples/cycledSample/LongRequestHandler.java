package com.rchab.gof.chain.samples.cycledSample;

public class LongRequestHandler extends RequestHandler {

    public LongRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public boolean isAppropriateRequest(Number request) {
        return request instanceof Long;
    }

    @Override
    public void executeRequest(Number request) {
        System.out.println("Found Long: " + request);
    }
}
