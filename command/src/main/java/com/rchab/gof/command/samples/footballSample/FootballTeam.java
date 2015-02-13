package com.rchab.gof.command.samples.footballSample;

public class FootballTeam extends Receiver {

    protected Integer size;

    public FootballTeam(Integer defenders, Integer forwards, Speed speed) {
        super(defenders, forwards, speed);
        this.size = defenders + forwards;
    }

    public void addDefender(){
        if(defenders < size){
            defenders++;
            forwards--;
        }
    }

    public void addForward(){
        if(forwards<size){
            forwards++;
            defenders--;
        }
    }

    public void riseSpeed() {
        if (this.speed == Speed.NORMAL){
            this.speed = Speed.HIGH;
        } else if (this.speed == Speed.LOW){
            this.speed = Speed.NORMAL;
        }
    }

    @Override
    public Speed getSpeed() {
        return speed;
    }
}
