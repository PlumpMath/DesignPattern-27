package com.design.Prototype.ShallowCopy;

public class Client
{
    public static void main(String[] args)
    {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("里斯");

        System.out.println(thing.getValue());
    }
}
