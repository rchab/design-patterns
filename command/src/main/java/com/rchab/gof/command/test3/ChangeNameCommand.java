package com.rchab.gof.command.test3;

public class ChangeNameCommand implements Command {

    private Receiver receiver;
    private String previousName;

    public ChangeNameCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        previousName = receiver.getName();
        receiver.setName("Changed Name");
    }

    @Override
    public void undo() {
        receiver.setName(previousName);
    }
}
