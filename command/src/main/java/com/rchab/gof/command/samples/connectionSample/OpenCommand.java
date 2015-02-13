package com.rchab.gof.command.samples.connectionSample;

public class OpenCommand implements Command {

    private Receiver receiver;

    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.open();
    }
}
