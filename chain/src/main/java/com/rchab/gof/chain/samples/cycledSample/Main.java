package com.rchab.gof.chain.samples.cycledSample;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        for(Number number: prepareNumbers()){
            client.makeRequest(number);
        }
    }

    private static List<Number> prepareNumbers(){
        short shortNumber = 2;

        List<Number> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(new Short(shortNumber));
        numbers.add(new Long(3));
        numbers.add(new Short("4"));
        numbers.add(new Integer(5));
        numbers.add(new Double(6));

        return numbers;
    }
}
