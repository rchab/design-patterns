package com.rchab.gof.interpreter.samples.reverseSample;

import java.util.LinkedList;
import java.util.List;

import static com.rchab.gof.interpreter.samples.reverseSample.Elements.letters;
import static com.rchab.gof.interpreter.samples.reverseSample.Elements.numbers;

public class Client {

    public List<Expression> analyze(Context context){
        List<Expression> expressionList = new LinkedList<Expression>();

        char[] tokens = context.getInput().toCharArray();
        for(char token: tokens){
            String strToken = String.valueOf(token).toLowerCase();
            expressionList.add(defineExpression(strToken));
        }
        return expressionList;
    }

    private Expression defineExpression(String token){
        if(isNumber(token)){
            return new NumberExpression(token);
        } else if (isLetter(token)){
            return new LetterExpression(token);
        } else return new SimpleExpression(token);
    }

    private boolean isNumber(String token){
        return numbers.containsKey(token);
    }

    private boolean isLetter(String token) {
        return letters.containsKey(token);
    }


}
