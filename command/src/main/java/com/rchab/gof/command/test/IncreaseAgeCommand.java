package com.rchab.gof.command.test;

public class IncreaseAgeCommand implements Command {

    private Integer previousAge;

    private Receiver receiver;

    public IncreaseAgeCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        previousAge = receiver.getAge();
        receiver.setAge(previousAge + 1);
    }

    @Override
    public void undo() {
        receiver.setAge(previousAge);
    }
}
