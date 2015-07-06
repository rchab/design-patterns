package com.rchab.gof.interpreter.templates.basicTempate;

public class LowerCaseExpression implements Expression {
    private String value;

    public LowerCaseExpression(String value) {
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        String output = context.getOutput().concat(value.toLowerCase());
        context.setOutput(output + " ");
    }
}
