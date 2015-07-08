package com.rchab.gof.command.templates.basicTemplate;

public class Client {

    public static void main(String[] args) {

        Target target = new Target();
        Command command = new ConcreteCommand(target);

        Invoker invoker = new Invoker();
        invoker.executeCommand(command);
    }
}
