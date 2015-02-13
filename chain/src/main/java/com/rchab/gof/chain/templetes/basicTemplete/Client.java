package com.rchab.gof.chain.templetes.basicTemplete;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain(){
        chain = new FirstRequestHandler(new SecondRequestHandler(null));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
