package com.design.Intermediary.Pattern;

public class ConcreteColleague1 extends Colleague
{

    public ConcreteColleague1(Mediator _mediator)
    {
        super(_mediator);
    }

    public void selfMethod1()
    {

    }

    public void depMethod()
    {
        super.mediator.doSomething1();
    }
}
