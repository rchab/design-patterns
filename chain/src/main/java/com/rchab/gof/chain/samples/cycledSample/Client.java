package com.rchab.gof.chain.samples.cycledSample;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain(){
        chain = new LongRequestHandler(new IntegerRequestHandler(new ShortRequestHandler(null)));
    }

    public void makeRequest(Number number){
        chain.handleRequest(number);
    }
}
