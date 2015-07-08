package com.rchab.gof.chain.test5;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain() {
        chain = new ShortWordsHandler(new LongWordsHanlder(null));
    }

    public void handleRequest(String request){
        chain.handleRequest(request);
    }
}
