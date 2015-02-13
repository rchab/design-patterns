package com.rchab.gof.command.samples.gardenSample;

public class Worker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
