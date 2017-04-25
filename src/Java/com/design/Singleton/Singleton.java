package com.design.Singleton;

public class Singleton
{
    private static final Singleton singleton = new Singleton();

    private Singleton()
    {
    }

    public Singleton getSingleton()
    {
        return singleton;
    }

    public static void doSomething()
    {
        //...
    }
}