package com.rchab.gof.chain.test4;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    public void handleRequest(String request){
        chain.handleRequest(request);
    }

    private void buildChain() {
        chain = new JustLowerHandler(new JustUpperHandler(null));
    }
}
