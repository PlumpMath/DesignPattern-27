package com.design.Singleton;

public class SingletonFull
{
    private static SingletonFull singletonFull = null;

    private SingletonFull()
    {
    }

    public static synchronized SingletonFull getSingletonFull()
    {
        if (singletonFull == null)
        {
            singletonFull = new SingletonFull();
        }
        return singletonFull;
    }

    public static void doSomething()
    {
        //...
    }
}
