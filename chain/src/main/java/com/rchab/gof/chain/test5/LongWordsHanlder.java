package com.rchab.gof.chain.test5;

public class LongWordsHanlder extends RequestHandler {

    public LongWordsHanlder(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(String request) {
        System.out.println("Long word was upper cased: " + request.toUpperCase());
    }

    @Override
    protected boolean isAppropriateRequest(String request) {
        return request.length() > ShortWordsHandler.MAX_SHORT_WORD_SIZE;
    }
}
