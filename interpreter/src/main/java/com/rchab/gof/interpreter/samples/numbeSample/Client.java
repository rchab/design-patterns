package com.rchab.gof.interpreter.samples.numbeSample;

public class Client {

    public static void main(String[] args) {
        Context context = new Context("1 024 3");

        Expression expression = new DecimalExpression();
        expression.interpret(context);

        System.out.println(context.getOutput());

    }
}
