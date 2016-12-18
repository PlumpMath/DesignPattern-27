package com.chenziqiang.FactoryPattern.MoreFactoryPattern;

import com.chenziqiang.FactoryPattern.CreateHuman.Human;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
