package com.rchab.gof.interpreter.samples.reverseSample;

public class NumberExpression implements Expression {

    private String key;

    public NumberExpression(String key) {
        this.key = key;
    }

    @Override
    public void interpret(Context context) {
        String value = Elements.numbers.get(key);
        String output = context.getOutput().concat(value);
        context.setOutput(output);
    }
}
