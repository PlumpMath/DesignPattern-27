package com.design.Prototype;

public class Client
{
    public static void main(String[] args)
    {
        Thing thing = new Thing();
        System.out.print("-------");
        Thing cloneThing = thing.clone();
    }
}
