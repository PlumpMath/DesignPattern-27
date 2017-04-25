package com.design.AbstractFactory.Pattern;

public class Creator1 extends AbstractCreator
{
    @Override
    public AbstractProductA createProductA()
    {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB()
    {
        return new ProductB1();
    }
}
