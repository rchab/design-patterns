package com.rchab.gof.interpreter.templates.basicTempate;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Client {

    public List<Expression> analyzeContext(Context context) {
        List<Expression> expressionList = new LinkedList<Expression>();
        StringTokenizer st = new StringTokenizer(context.getInput(), " ");
        boolean isUpper = true;

        while (st.hasMoreTokens()) {
            if(isUpper){
                expressionList.add(new UpperCaseExpression(st.nextToken()));
                isUpper = false;
            } else {
                expressionList.add(new LowerCaseExpression(st.nextToken()));
                isUpper = true;
            }
        }

        return expressionList;
    }
}
