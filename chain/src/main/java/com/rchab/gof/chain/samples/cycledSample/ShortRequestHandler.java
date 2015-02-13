package com.rchab.gof.chain.samples.cycledSample;

public class ShortRequestHandler extends RequestHandler {

    protected ShortRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public boolean isAppropriateRequest(Number request) {
        return request instanceof Short;
    }

    @Override
    public void executeRequest(Number request) {
        System.out.println("Found Short: " + request);
    }
}
