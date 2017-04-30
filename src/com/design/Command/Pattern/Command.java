package com.design.Command.Pattern;

public abstract class Command
{
    protected Receiver receiver;

    public Command(Receiver _receiver)
    {
        this.receiver = _receiver;
    }

    public abstract void execute();
}
