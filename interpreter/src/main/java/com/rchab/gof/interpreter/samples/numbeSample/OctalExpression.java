package com.rchab.gof.interpreter.samples.numbeSample;

public class OctalExpression extends Expression {
    @Override
    public boolean isAppropriateToken(String token) {
        return token.startsWith(OCTAL_PREFIX)&&!token.startsWith(HEXA_PREFIX);
    }

    @Override
    public Integer convert(String token) {
        String numbers = token.substring(1);
        return Integer.parseInt(numbers, 8);
    }
}
