package com.rchab.gof.chain.test2;

public class HandlerForStringStartingWithB extends RequestHandler{

    public static final String B_SYMBOL = "B";
    public static final String B_COUNTRY = "_B_COUNTRY";

    public HandlerForStringStartingWithB(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(String request) {
        String handledString = request.concat(B_COUNTRY);
        System.out.println(handledString);
    }

    @Override
    protected boolean isAppropriateRequest(String request) {
        return request.startsWith(B_SYMBOL);
    }

}
