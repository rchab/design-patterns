package com.rchab.gof.interpreter.samples.numbeSample;

public class Client {

    public static void main(String[] args) {
        Context context = new Context("1 024 3 0x1D");

        Expression decimalExpression = new DecimalExpression();
        Expression hexaDecimalExpression = new HexaDecimalExpression();
        Expression octalExpression = new OctalExpression();

        decimalExpression.interpret(context);
        hexaDecimalExpression.interpret(context);
        octalExpression.interpret(context);

        System.out.println(context.getOutput());

    }
}
