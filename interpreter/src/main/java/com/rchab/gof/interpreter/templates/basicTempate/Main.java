package com.rchab.gof.interpreter.templates.basicTempate;

public class Main {

    public static void main(String[] args) {
        String input = "Here is some simple text example";
        Context context = new Context(input);

        for (Expression expression : new Client().analyzeContext(context)) {
            expression.interpret(context);
        }

        System.out.println(context.getOutput());
    }
}
