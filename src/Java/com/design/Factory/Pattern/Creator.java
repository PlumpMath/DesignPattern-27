package com.design.Factory.Pattern;

public abstract class Creator
{
    public abstract <T extends Product> T createProduct(Class<T> c);
}
