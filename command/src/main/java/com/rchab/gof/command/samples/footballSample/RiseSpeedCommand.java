package com.rchab.gof.command.samples.footballSample;

public class RiseSpeedCommand extends Command{

    private Speed lastSpeed;

    @Override
    public void execute(Target target) {
        lastSpeed = target.getSpeed();
        target.riseSpeed();
        this.target = target;
    }

    @Override
    public void undo() {
        if(target != null && lastSpeed != null){
            target.setSpeed(lastSpeed);
        }
    }

    @Override
    public String toString() {
        return "RiseSpeedCommand";
    }
}
