package com.chenziqiang._2_FactoryPattern.MoreFactoryPattern;

import com.chenziqiang._2_FactoryPattern.CreateHuman.BlackHuman;
import com.chenziqiang._2_FactoryPattern.CreateHuman.Human;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
