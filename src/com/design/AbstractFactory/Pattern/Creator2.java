package com.design.AbstractFactory.Pattern;

public class Creator2 extends AbstractCreator
{
    @Override
    public AbstractProductA createProductA()
    {
        System.out.println("A Product 2");
        return null;
    }

    @Override
    public ProductB1 createProductB()
    {
        System.out.println("B Product 2");
        return null;
    }
}
