package com.rchab.gof.command.templates.basicTemplate;

public class Invoker {

    public void executeCommand(Command command){
        command.execute();
    }

    public void undoCommand(Command command) {
        command.undo();
    }
}
