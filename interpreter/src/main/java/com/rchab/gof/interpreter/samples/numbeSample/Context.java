package com.rchab.gof.interpreter.samples.numbeSample;

public class Context {
    private String input;
    private Integer output;

    public Context(String input) {
        this.input = input;
        this.output = 0;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Integer getOutput() {
        return output;
    }

    public void addOutput(Integer number) {
        this.output += number;
    }
}
