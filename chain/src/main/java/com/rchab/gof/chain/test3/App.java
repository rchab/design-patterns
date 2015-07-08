package com.rchab.gof.chain.test3;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        Request request = new Request("To CO: please provide some documents");
        client.handleRequest(request);
        System.out.println(request.getContent());
    }
}
