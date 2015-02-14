package com.rchab.gof.chain.templates.basicTemplate;

public class SecondRequestHandler extends RequestHandler {

    public SecondRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public boolean isAppropriateRequest(Request request) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void executeRequest(Request request) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
