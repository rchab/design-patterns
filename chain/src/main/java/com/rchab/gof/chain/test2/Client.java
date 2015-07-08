package com.rchab.gof.chain.test2;

public class Client {

    private RequestHandler chainOfHandlers;

    public Client() {
        buildChain();
    }

    private void buildChain() {
        chainOfHandlers = new HandlerForStringStartingWithA(new HandlerForStringStartingWithB(null));
    }

    public void handleRequest(String request){
        chainOfHandlers.handleRequest(request);
    }
}

