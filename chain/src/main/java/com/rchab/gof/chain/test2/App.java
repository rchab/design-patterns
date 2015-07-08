package com.rchab.gof.chain.test2;

public class App {
    public static void main(String[] args) {
        Client client = new Client();

        client.handleRequest("ARGENTINA");
        client.handleRequest("BOLIVIA");
        client.handleRequest("COLUMBIA");


    }
}
