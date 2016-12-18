package com.chenziqiang.FactoryPattern.MoreFactoryPattern;

import com.chenziqiang.FactoryPattern.CreateHuman.Human;
import com.chenziqiang.FactoryPattern.CreateHuman.WhiteHuman;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
