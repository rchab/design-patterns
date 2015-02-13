package com.rchab.gof.chain.templetes.cycledTemplete;

public class RequestHandler {

    RequestHandler next;

    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (isFree()) {
            executeRequest(request);
        } else {
            delegateRequestToNext(request);
        }
    }

    private void delegateRequestToNext(Request request){
        if (next != null){
            next.handleRequest(request);
        }
    }

    private boolean isFree() {
        //To change body of created methods use File | Settings | File Templates.
        return false;
    }

    private void executeRequest(Request request){
        //To change body of created methods use File | Settings | File Templates.
    }

}
