package com.rchab.gof.command.test3;

public class Receiver {

    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "name='" + name + '\'' +
                '}';
    }
}
