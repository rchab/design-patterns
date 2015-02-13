package com.rchab.gof.command.samples.connectionSample;

public class CloseCommand implements Command {

    private Receiver receiver;

    public CloseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.close();
    }
}
