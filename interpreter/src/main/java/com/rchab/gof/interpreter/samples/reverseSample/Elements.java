package com.rchab.gof.interpreter.samples.reverseSample;

import java.util.HashMap;
import java.util.Map;

public class Elements {
    public static final Map<String, String> numbers = new HashMap<String, String>();
    public static final Map<String, String> letters = new HashMap<String, String>();

    static {
        numbers.put("0","9");
        numbers.put("1","8");
        numbers.put("2","7");
        numbers.put("3","6");
        numbers.put("4","5");
        numbers.put("5","4");
        numbers.put("6","3");
        numbers.put("7","2");
        numbers.put("8","1");
        numbers.put("9","0");

        letters.put("a", "z");
        letters.put("b", "y");
        letters.put("c", "x");
        letters.put("d", "w");
        letters.put("e", "v");
        letters.put("f", "u");
        letters.put("g", "t");
        letters.put("h", "s");
        letters.put("i", "r");
        letters.put("j", "q");
        letters.put("k", "p");
        letters.put("l", "o");
        letters.put("m", "n");
        letters.put("n", "m");
        letters.put("o", "l");
        letters.put("p", "k");
        letters.put("q", "j");
        letters.put("r", "i");
        letters.put("s", "h");
        letters.put("t", "g");
        letters.put("u", "f");
        letters.put("v", "e");
        letters.put("w", "d");
        letters.put("x", "c");
        letters.put("y", "b");
        letters.put("z", "a");
    }
}
