package com.chenziqiang.FactoryPattern.CreateHuman;

/**
 * Created by chenziqiang on 2016/12/17.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白发苍苍");
    }

    @Override
    public void talk() {
        System.out.println("沧海一声笑");
    }
}
