package com.rchab.gof.chain.test;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain() {
        chain = new IntegerRequestHandler(new LongRequestHandler(null));
    }

    public void handleRequest(Number request){
        chain.handleRequest(request);
    }


}
