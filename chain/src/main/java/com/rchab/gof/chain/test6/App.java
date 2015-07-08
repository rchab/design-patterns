package com.rchab.gof.chain.test6;

public class App {

    public static void main(String[] args) {
        Request lowRequest = new Request("R1", RequestType.LOW);
        Request highRequest = new Request("R2", RequestType.HIGH);
        Request middleRequest = new Request("R3", RequestType.MIDDLE);

        Client client = new Client();

        client.handleRequest(middleRequest);
    }
}
