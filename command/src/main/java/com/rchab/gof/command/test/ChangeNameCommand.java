package com.rchab.gof.command.test;

public class ChangeNameCommand implements Command{

    private String previousName;
    private Receiver receiver;

    public ChangeNameCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        previousName = receiver.getName();
        receiver.setName("Changed");
    }

    @Override
    public void undo() {
        receiver.setName(previousName);
    }
}
