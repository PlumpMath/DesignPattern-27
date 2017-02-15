package com.chenziqiang._2_FactoryPattern.SimpleFactory;

import com.chenziqiang._2_FactoryPattern.CreateHuman.Human;
import com.chenziqiang._2_FactoryPattern.CreateHuman.WhiteHuman;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class NvWa {
    public static void main(String[] args) {
        Human whiteHuman = AbstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
