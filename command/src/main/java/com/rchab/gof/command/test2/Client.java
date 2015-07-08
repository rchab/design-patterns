package com.rchab.gof.command.test2;

public class Client {

    public static void main(String[] args) {
        Target target = new Target("Old target name");
        Command changeNameCommand = new ChangeNameCommand(target);

        Invoker invoker = new Invoker();

        System.out.println(target);
        invoker.executeCommand(changeNameCommand);
        System.out.println(target);


        invoker.undoCommand(changeNameCommand);
        System.out.println(target);
    }

}
