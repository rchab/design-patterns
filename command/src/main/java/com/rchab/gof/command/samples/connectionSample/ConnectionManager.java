package com.rchab.gof.command.samples.connectionSample;


import java.util.LinkedList;
import java.util.List;

// Invoker
public class ConnectionManager {

    private List<Command> commandList  = new LinkedList();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command: commandList){
            command.execute();
            commandList.remove(command);
        }
    }
}
