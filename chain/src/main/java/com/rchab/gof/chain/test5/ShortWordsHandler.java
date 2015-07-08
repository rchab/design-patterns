package com.rchab.gof.chain.test5;

public class ShortWordsHandler extends RequestHandler {

    public static final int MAX_SHORT_WORD_SIZE = 4;

    public ShortWordsHandler(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(String request) {
        System.out.println("Short word was lower cased: " + request);
    }

    @Override
    protected boolean isAppropriateRequest(String request) {
        return request.length() < MAX_SHORT_WORD_SIZE;
    }
}
