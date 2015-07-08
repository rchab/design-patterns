package com.rchab.gof.chain.test5;

public class App {

    public static void main(String[] args) {
        String text = "This is verY interesting TeXt";
        Client client = new Client();
        for (String word: text.split(" ")){
            client.handleRequest(word);
        }

    }
}
