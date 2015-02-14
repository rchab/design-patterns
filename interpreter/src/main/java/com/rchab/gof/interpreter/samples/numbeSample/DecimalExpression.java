package com.rchab.gof.interpreter.samples.numbeSample;

import java.util.StringTokenizer;

public class DecimalExpression extends Expression {

    public boolean isAppropriateToken(String token){
        return !token.startsWith(HEXA_PREFIX) && !token.startsWith(OCTAL_PREFIX);
    }

    public Integer convert(String token){
        return Integer.parseInt(token);
    }
}
