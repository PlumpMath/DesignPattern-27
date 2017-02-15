package com.chenziqiang._2_FactoryPattern.CreateHuman;

/**
 * Created by chenziqiang on 2016/12/17.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
