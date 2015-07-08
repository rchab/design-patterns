package com.rchab.gof.chain.test3;

public class Director extends RequestHandler {

    public static final String DIRECTOR_APPROVED = " Director approved! ";

    public Director(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(Request request) {
        String content = request.getContent();
        request.setContent(content.concat(DIRECTOR_APPROVED));
    }

    @Override
    protected boolean isAppropriateRequest(Request request) {
        return request.getContent().startsWith("To Director: ");
    }
}
