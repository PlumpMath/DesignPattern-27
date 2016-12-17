package com.chenziqiang.FactoryPattern.NativeFactory;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public abstract class Creator {
    public abstract <T extends Product> T FactoryMethod(Class<T> c);
}
