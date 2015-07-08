package com.rchab.gof.chain.test2;

public class HandlerForStringStartingWithA extends RequestHandler {


    public static final String A_SYMBOL = "A";
    public static final String EMPTY_STRING = "";

    public HandlerForStringStartingWithA(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(String request) {
        String handledString = request.replaceAll(A_SYMBOL, EMPTY_STRING);
        System.out.println(handledString);
    }

    @Override
    protected boolean isAppropriateRequest(String request) {
        return request.startsWith(A_SYMBOL);
    }
}
