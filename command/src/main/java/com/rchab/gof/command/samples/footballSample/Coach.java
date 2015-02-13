package com.rchab.gof.command.samples.footballSample;

public class Coach {

    private Command lastCommand;

    public void executeCommandForTarget(Command command, Target target){
        command.execute(target);
        lastCommand = command;
    }

    public void undoLastCommand(){
        if(lastCommand != null){
            lastCommand.undo();
        }
    }
}
