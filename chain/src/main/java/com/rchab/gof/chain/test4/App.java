package com.rchab.gof.chain.test4;

public class App {

    public static void main(String[] args) {
        String text = "This iS UPPER aNd LOWER caSes";
        Client client = new Client();
        for (String word: text.split(" ")) {
            client.handleRequest(word);
        }
    }
}
