package com.rchab.gof.chain.test;

public class App {
    public static void main(String[] args) {
        Integer request1 = 10;
        Long request2 = 10L;
        Short request3 = 20;

        Client client = new Client();

        client.handleRequest(request3);




    }
}
