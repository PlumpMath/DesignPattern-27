package com.design;

public class SingletonFull
{
    private final static SingletonFull singletonFull = null;

    public SingletonFull getSingletonFull()
    {
        if (singletonFull == null)
        {
            return new SingletonFull();
        }
        return singletonFull;
    }
}
