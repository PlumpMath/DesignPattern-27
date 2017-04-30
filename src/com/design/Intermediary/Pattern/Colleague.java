package com.design.Intermediary.Pattern;

public abstract class Colleague
{
    protected Mediator mediator;

    public Colleague(Mediator _mediator)
    {
        this.mediator = _mediator;
    }
}
