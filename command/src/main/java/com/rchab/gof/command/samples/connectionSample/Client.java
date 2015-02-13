package com.rchab.gof.command.samples.connectionSample;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Connection();
        System.out.println(receiver);

        Command openCommand = new OpenCommand(receiver);
        Command closeCommand = new CloseCommand(receiver);

        ConnectionManager invoker = new ConnectionManager();

        invoker.addCommand(openCommand);
        invoker.executeCommands();
        System.out.println(receiver);

        invoker.addCommand(closeCommand);
        invoker.executeCommands();
        System.out.println(receiver);
    }
}
