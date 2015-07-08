package com.rchab.gof.command.test3;

public class App {
    public static void main(String[] args) {
        Receiver receiver = new Receiver("Before Change");
        Command command = new ChangeNameCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        System.out.println(receiver);
        invoker.executeCommand();
        System.out.println(receiver);

        invoker.undoCommand();
        System.out.println(receiver);

    }

}
