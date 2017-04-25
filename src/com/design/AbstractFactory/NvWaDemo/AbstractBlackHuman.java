package com.design.AbstractFactory.NvWaDemo;

public abstract class AbstractBlackHuman implements Human
{
    @Override
    public void getColor()
    {
        System.out.println("Black");
    }

    @Override
    public void talk()
    {

    }

    @Override
    public abstract void getSex();
}
