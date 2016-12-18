package com.chenziqiang.FactoryPattern.MoreFactoryPattern;

import com.chenziqiang.FactoryPattern.CreateHuman.BlackHuman;
import com.chenziqiang.FactoryPattern.CreateHuman.Human;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class NvWa {
    public static void main(String[] args) {
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
