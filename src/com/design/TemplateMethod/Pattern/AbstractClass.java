package com.design.TemplateMethod.Pattern;

public abstract class AbstractClass
{

    protected abstract void doSomething();
    protected abstract void doAnything();

    public void templateMehtod()
    {
        this.doAnything();
        this.doSomething();
    }
}
