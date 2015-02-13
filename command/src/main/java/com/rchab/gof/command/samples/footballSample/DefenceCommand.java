package com.rchab.gof.command.samples.footballSample;

public class DefenceCommand extends Command {

    private Receiver receiver;
    private Integer lastDefenders;
    private Integer lastForwards;

    public DefenceCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.lastDefenders = receiver.getDefenders();
        this.lastForwards = receiver.getForwards();
        receiver.addDefender();
    }

    @Override
    public void undo() {
        if(receiver != null && lastDefenders != null && lastForwards != null){
            receiver.setDefenders(lastDefenders);
            receiver.setForwards(lastForwards);
        }
    }

    @Override
    public String toString() {
        return "DefenceCommand";
    }
}
