package com.design;

public class Singleton
{
    private static final Singleton singleton = new Singleton();

    public Singleton getSingleton()
    {
        return singleton;
    }
}