package com.rchab.gof.chain.test7;

public class LowPriorityRequest extends RequestHandler {

    public LowPriorityRequest(RequestHandler nextHandler, RequestType requestType) {
        super(nextHandler, requestType);
    }

    @Override
    protected void executeRequest(Request request) {
        System.out.println("It's very simple request: " + request);
    }
}
