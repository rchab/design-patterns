package com.rchab.gof.chain.test7;

public class HighPriorityHandler extends RequestHandler{

    public HighPriorityHandler(RequestHandler nextHandler, RequestType requestType) {
        super(nextHandler, requestType);
    }

    @Override
    protected void executeRequest(Request request) {
        System.out.println("Handling very important request: " + request);
    }
}
