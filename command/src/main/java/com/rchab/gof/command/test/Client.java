package com.rchab.gof.command.test;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver("BeforeChangeName", 20);
        System.out.println(receiver);

        Command changeNameCommand = new ChangeNameCommand(receiver);
        invoker.setCommand(changeNameCommand);
        invoker.executeCommand();
        System.out.println(receiver);

        invoker.undoCommand();
        System.out.println(receiver);

        Command increaseAgeCommand = new IncreaseAgeCommand(receiver);

        invoker.setCommand(increaseAgeCommand);
        invoker.executeCommand();
        System.out.println(receiver);

        invoker.undoCommand();
        System.out.println(receiver);

    }

}
