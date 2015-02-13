package com.rchab.gof.command.samples.footballSample;

public class DefenceCommand extends Command {

    private Integer lastDefenders;
    private Integer lastForwards;

    @Override
    public void execute(Target target) {
        this.lastDefenders = target.getDefenders();
        this.lastForwards = target.getForwards();
        target.addDefender();
        this.target = target;
    }

    @Override
    public void undo() {
        if(target != null && lastDefenders != null && lastForwards != null){
            target.setDefenders(lastDefenders);
            target.setForwards(lastForwards);
        }
    }

    @Override
    public String toString() {
        return "DefenceCommand";
    }
}
