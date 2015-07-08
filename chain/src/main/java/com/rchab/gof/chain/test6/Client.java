package com.rchab.gof.chain.test6;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain() {
        chain = new LowPriorityHandler(new HighPriorityRequestHandler(null));
    }

    public void handleRequest(Request request) {
        chain.handleRequest(request);
    }
}
