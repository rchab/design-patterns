package com.rchab.gof.command.test2;

public class Invoker {

    public void executeCommand(Command command) {
        command.execute();
    }

    public void undoCommand(Command command) {
        command.undo();
    }
}
