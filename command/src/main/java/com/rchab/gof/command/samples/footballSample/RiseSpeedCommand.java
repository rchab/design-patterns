package com.rchab.gof.command.samples.footballSample;

public class RiseSpeedCommand extends Command{

    private Receiver receiver;
    private Speed lastSpeed;

    public RiseSpeedCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        lastSpeed = receiver.getSpeed();
        receiver.riseSpeed();
    }

    @Override
    public void undo() {
        if(receiver != null && lastSpeed != null){
            receiver.setSpeed(lastSpeed);
        }
    }

    @Override
    public String toString() {
        return "RiseSpeedCommand";
    }
}
