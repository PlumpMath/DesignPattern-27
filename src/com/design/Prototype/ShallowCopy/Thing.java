package com.design.Prototype.ShallowCopy;

import java.util.ArrayList;

public class Thing implements Cloneable
{
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected Thing clone()
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

    public void setValue(String value)
    {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue()
    {
        return this.arrayList;
    }
}
