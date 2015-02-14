package com.rchab.gof.interpreter.samples.reverseSample;

public class Main {

    public static void main(String[] args) {
        String input = "Nb uzelirg mfnyvi rh 86";
        Context context = new Context(input);

        Client client = new Client();

        for(Expression expression: client.analyze(context)){
            expression.interpret(context);
        }
        System.out.println(context.getOutput());
    }
}
