package com.rchab.gof.chain.samples.companySample;

public abstract class RequestHandler {

    private RequestHandler next;
    private RequestType type;

    protected RequestHandler(RequestType type, RequestHandler next) {
        this.next = next;
        this.type = type;
    }

    public void handleRequest(Request request) {
        if (isAppropriateRequest(request)) {
            executeRequest(request);
        } else {
            delegateRequestToNext(request);
        }
    }

    public boolean isAppropriateRequest(Request request){
        return request.getType().equals(type);
    }

    public abstract void executeRequest(Request request);

    public void delegateRequestToNext(Request request){
        if (next != null){
            next.handleRequest(request);
        } else {
            processUnHandledRequest(request);
        }
    }

    public void processUnHandledRequest(Request request){
        System.out.println(request  + " wasn't handled");
    }
}
