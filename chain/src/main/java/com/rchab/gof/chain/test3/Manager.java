package com.rchab.gof.chain.test3;

public class Manager extends RequestHandler {

    public static final String MANAGER_APPROVED = " Manager approved";

    public Manager(RequestHandler next) {
        super(next);
    }

    @Override
    protected void executeRequest(Request request) {
        String requestContent = request.getContent();
        request.setContent(requestContent.concat(MANAGER_APPROVED));
    }

    @Override
    protected boolean isAppropriateRequest(Request request) {
        return request.getContent().startsWith("To Manager: ");
    }
}
