package com.rchab.gof.command.samples.footballSample;

public abstract class Target {

    protected Integer defenders;
    protected Integer forwards;
    protected Speed speed;

    protected Target(Integer defenders, Integer forwards, Speed speed) {
        this.defenders = defenders;
        this.forwards = forwards;
        this.speed = speed;
    }

    public abstract void addDefender();

    public abstract void addForward();

    public abstract void riseSpeed();

    public Integer getDefenders() {
        return defenders;
    }

    public void setDefenders(Integer defenders) {
        this.defenders = defenders;
    }

    public Integer getForwards() {
        return forwards;
    }

    public void setForwards(Integer forwards) {
        this.forwards = forwards;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Target{" +
                "defenders=" + defenders +
                ", forwards=" + forwards +
                ", speed=" + speed +
                '}';
    }
}
