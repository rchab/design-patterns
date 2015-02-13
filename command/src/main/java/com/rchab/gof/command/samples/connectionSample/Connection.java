package com.rchab.gof.command.samples.connectionSample;

// Receiver
public class Connection extends Receiver{

    boolean isOpen = false;

    public void open(){
        isOpen = true;
    }

    public void close(){
        isOpen = false;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "isOpen=" + isOpen +
                '}';
    }
}
