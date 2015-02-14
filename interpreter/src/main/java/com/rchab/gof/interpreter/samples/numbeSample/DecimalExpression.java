package com.rchab.gof.interpreter.samples.numbeSample;

import java.util.StringTokenizer;

public class DecimalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        StringTokenizer tokenizer = new StringTokenizer(context.getInput(), " ");
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if(isAppropriateToken(token)){
                context.addOutput(convert(token));
            }
        }
    }

    private boolean isAppropriateToken(String token){
        return !token.startsWith("0x") && !token.startsWith("0");
    }

    private Integer convert(String token){
        return Integer.parseInt(token);
    }
}
