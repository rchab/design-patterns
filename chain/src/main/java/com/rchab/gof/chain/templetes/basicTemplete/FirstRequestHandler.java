package com.rchab.gof.chain.templetes.basicTemplete;

public class FirstRequestHandler extends RequestHandler{

    public FirstRequestHandler(RequestHandler next) {
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
