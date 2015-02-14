package com.rchab.gof.interpreter.templates.basicTempate;

public class UpperCaseExpression implements Expression {

    private String value;

    public UpperCaseExpression(String value) {
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        String output = context.getOutput().concat(value.toUpperCase());
        context.setOutput(output + " ");
    }
}
