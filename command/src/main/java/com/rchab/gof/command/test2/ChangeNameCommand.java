package com.rchab.gof.command.test2;

public class ChangeNameCommand implements Command {

    private String previousName;

    private Target target;


    public ChangeNameCommand(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        previousName = target.getName();
        target.setName("new name");
    }

    @Override
    public void undo() {
        target.setName(previousName);
    }
}
