package com.chenziqiang._2_FactoryPattern.MoreFactoryPattern;

import com.chenziqiang._2_FactoryPattern.CreateHuman.Human;

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
