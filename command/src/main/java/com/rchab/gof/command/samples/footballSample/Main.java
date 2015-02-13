package com.rchab.gof.command.samples.footballSample;

public class Main {

    public static void main(String[] args) {
        Coach coach = new Coach();
        Target target = new FootballTeam(10, 0, Speed.NORMAL);
        System.out.println(target);

        coach.executeCommandForTarget(new RiseSpeedCommand(), target);
        System.out.println(target);

        coach.executeCommandForTarget(new DefenceCommand(), target);
        System.out.println(target);

        coach.undoLastCommand();
        System.out.println(target);

    }
}
