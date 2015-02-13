package com.rchab.gof.command.samples.footballSample;

public class Coach {

    private Command lastCommand;

    public void executeCommandForTarget(Command command){
        command.execute();
        lastCommand = command;
        System.out.println(command + " done");
    }

    public void undoLastCommand(){
        if(lastCommand != null){
            lastCommand.undo();
            System.out.println(lastCommand + " undo");
        }
    }
}
