package com.rchab.gof.interpreter.samples.numbeSample;

import java.util.StringTokenizer;

public abstract class Expression {

    public static final String OCTAL_PREFIX = "0";
    public static final String HEXA_PREFIX = "0x";
    public static final String DELIMITER = " ";


    public void interpret(Context context){
        StringTokenizer tokenizer = new StringTokenizer(context.getInput(), DELIMITER);
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if(isAppropriateToken(token)){
                context.addOutput(convert(token));
            }
        }
    };

    public abstract boolean isAppropriateToken(String token);

    public abstract Integer convert(String token);


}
