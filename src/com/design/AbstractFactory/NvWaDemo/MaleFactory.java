package com.design.AbstractFactory.NvWaDemo;

public class MaleFactory implements HumanFactory
{
    @Override
    public Human createBlackHuman()
    {
        return new MaleBlackHuman();
    }
}
