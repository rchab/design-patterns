package com.rchab.gof.chain.samples.companySample;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.makeRequest(new Request(RequestType.MEDIUM));
        client.makeRequest(new Request(RequestType.COMPLEX));
        client.makeRequest(new Request(RequestType.OTHER));
    }
}
