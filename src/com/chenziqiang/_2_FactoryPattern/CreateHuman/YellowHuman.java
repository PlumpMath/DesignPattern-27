package com.chenziqiang._2_FactoryPattern.CreateHuman;

/**
 * Created by chenziqiang on 2016/12/17.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色大门");
    }

    @Override
    public void talk() {
        System.out.println("容祖儿");
    }
}
