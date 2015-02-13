package com.rchab.gof.command.samples.gardenSample;

public class AddTreeCommand implements Command{

    private TreeGarden treeGarden;

    public AddTreeCommand(TreeGarden treeGarden) {
        this.treeGarden = treeGarden;
    }

    @Override
    public void execute() {
        treeGarden.addTree();
    }
}
