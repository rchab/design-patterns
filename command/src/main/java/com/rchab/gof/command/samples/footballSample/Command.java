package com.rchab.gof.command.samples.footballSample;

public abstract class Command {

    protected Target target;

    public abstract void execute(Target target);

    public abstract void undo();

}
