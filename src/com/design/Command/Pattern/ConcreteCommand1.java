package com.design.Command.Pattern;

public class ConcreteCommand1 extends Command
{
    public ConcreteCommand1()
    {
        super(new ConcreteReciver1());
    }

    public ConcreteCommand1(Receiver _receiver)
    {
        super(_receiver);
    }

    @Override
    public void execute()
    {
        this.receiver.doSomething();
    }
}
