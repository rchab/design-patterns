package com.rchab.gof.command.samples.footballSample;

public class Client {

    public static void main(String[] args) {
        Coach invoker = new Coach();
        Receiver receiver = new FootballTeam(8, 2, Speed.LOW);
        System.out.println(receiver);

        invoker.executeCommandForTarget(new RiseSpeedCommand(receiver));
        System.out.println(receiver);

        invoker.executeCommandForTarget(new DefenceCommand(receiver));
        System.out.println(receiver);

        invoker.undoLastCommand();
        System.out.println(receiver);
    }
}
