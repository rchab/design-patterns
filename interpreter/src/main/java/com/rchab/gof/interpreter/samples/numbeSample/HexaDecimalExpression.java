package com.rchab.gof.interpreter.samples.numbeSample;

public class HexaDecimalExpression extends Expression {

    @Override
    public boolean isAppropriateToken(String token) {
        return token.startsWith(HEXA_PREFIX);
    }

    @Override
    public Integer convert(String token) {
        String numbers = token.substring(2);
        return Integer.parseInt(numbers, 16);
    }
}
