package com.rchab.gof.command.templates.basicTemplate;

public class ConcreteCommand implements Command {

    private Target target;
    private Target previousTarget;

    public ConcreteCommand(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        previousTarget = target;
        target.action();
    }

    @Override
    public void undo() {
        this.target = previousTarget;
    }
}
