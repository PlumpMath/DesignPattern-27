package com.design.Prototype;

public class Thing implements Cloneable
{
    public Thing()
    {
        System.out.println("TMD 执行了这个构造函数");
    }

    @Override
    public Thing clone()
    {
        Thing thing = null;
        try
        {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return thing;
    }
}
