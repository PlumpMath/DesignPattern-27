package com.design.Factory.Demo;

public abstract class AbstractHumanFactory
{
    public abstract <T extends Human> T creatHuman(Class<T> c);
}
