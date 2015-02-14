package com.rchab.gof.interpreter.samples.reverseSample;

public class SimpleExpression implements Expression {

    private String key;

    public SimpleExpression(String token) {
        this.key = token;
    }

    @Override
    public void interpret(Context context) {
        String output = context.getOutput().concat(key);
        context.setOutput(output);
    }
}
