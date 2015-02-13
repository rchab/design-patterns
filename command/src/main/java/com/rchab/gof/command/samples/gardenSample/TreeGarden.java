package com.rchab.gof.command.samples.gardenSample;

public class TreeGarden {

    private Integer numberOfTrees;

    public TreeGarden(Integer numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }

    public void addTree(){
        numberOfTrees++;
    }

    @Override
    public String toString() {
        return "TreeGarden{" +
                "numberOfTrees=" + numberOfTrees +
                '}';
    }
}
