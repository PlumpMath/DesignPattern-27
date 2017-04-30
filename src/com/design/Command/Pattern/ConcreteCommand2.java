package com.design.Command.Pattern;

public class ConcreteCommand2 extends Command
{
    public ConcreteCommand2()
    {
        super(new ConcreteReciver2());
    }

    public ConcreteCommand2(Receiver _receiver)
    {
        super(_receiver);
    }

    @Override
    public void execute()
    {
        this.receiver.doSomething();
    }
}
