package com.design.AbstractFactory.NvWaDemo;

public class FemaleFactory implements HumanFactory
{
    @Override
    public Human createBlackHuman()
    {
        return new FemaleBlackHuman();
    }
}
