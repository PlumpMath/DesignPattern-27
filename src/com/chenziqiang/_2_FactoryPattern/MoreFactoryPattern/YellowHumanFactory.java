package com.chenziqiang._2_FactoryPattern.MoreFactoryPattern;

import com.chenziqiang._2_FactoryPattern.CreateHuman.Human;
import com.chenziqiang._2_FactoryPattern.CreateHuman.YellowHuman;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
