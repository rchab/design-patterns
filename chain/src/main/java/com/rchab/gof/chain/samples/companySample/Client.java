package com.rchab.gof.chain.samples.companySample;

public class Client {

    private RequestHandler chain;

    public Client() {
        buildChain();
    }

    private void buildChain(){
        chain = new Employee(RequestType.SIMPLE, new Manager(RequestType.MEDIUM, new Director(RequestType.COMPLEX, null)));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
