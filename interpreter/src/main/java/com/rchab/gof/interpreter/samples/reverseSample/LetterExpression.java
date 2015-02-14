package com.rchab.gof.interpreter.samples.reverseSample;

public class LetterExpression implements Expression {

    private String key;

    public LetterExpression(String token) {
        this.key = token;
    }

    @Override
    public void interpret(Context context) {
        String value = Elements.letters.get(key);
        String output = context.getOutput().concat(value);
        context.setOutput(output);
    }
}
