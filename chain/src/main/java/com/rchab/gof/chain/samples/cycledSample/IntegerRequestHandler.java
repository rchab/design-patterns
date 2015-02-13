package com.rchab.gof.chain.samples.cycledSample;

public class IntegerRequestHandler extends RequestHandler {

    public IntegerRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public boolean isAppropriateRequest(Number request) {
        return request instanceof Integer;
    }

    @Override
    public void executeRequest(Number request) {
        System.out.println("Found Short: " + request);
    }

}
