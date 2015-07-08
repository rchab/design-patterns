package com.rchab.gof.chain.test7;

public class App {

    public static void main(String[] args) {
        Request smallRequest = new Request("Need coffee", RequestType.LOW);
        Request mediumRequest = new Request("Need new chair", RequestType.MEDIUM);
        Request bigRequest = new Request("Need new Monitor", RequestType.HIGH);

        Client client = new Client();

        client.handleRequest(smallRequest);
        client.handleRequest(mediumRequest);
        client.handleRequest(bigRequest);

    }
}
