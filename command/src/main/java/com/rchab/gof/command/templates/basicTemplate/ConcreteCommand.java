package com.rchab.gof.command.templates.basicTemplate;

public class ConcreteCommand implements Command {

    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
