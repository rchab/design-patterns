package com.rchab.gof.chain.templates.basicTemplate;

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
