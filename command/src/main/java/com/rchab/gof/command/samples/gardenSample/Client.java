package com.rchab.gof.command.samples.gardenSample;

public class Client {

    public static void main(String[] args) {
        TreeGarden treeGarden = new TreeGarden(5);
        System.out.println(treeGarden);

        Command command = new AddTreeCommand(treeGarden);
        Worker worker = new Worker();
        worker.setCommand(command);
        worker.executeCommand();
        System.out.println(treeGarden);

    }
}
