package com.rchab.gof.chain.test3;

public class Client {
    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain() {
        chain = new Manager(new Director(null));
    }

    public void handleRequest(Request request) {
        chain.handleRequest(request);
    }
}
