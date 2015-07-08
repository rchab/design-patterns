package com.rchab.gof.chain.test7;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain() {
        chain = new LowPriorityRequest(new HighPriorityHandler(null, RequestType.HIGH), RequestType.LOW);
    }

    public void handleRequest(Request request){
        chain.handleRequest(request);
    }
}
