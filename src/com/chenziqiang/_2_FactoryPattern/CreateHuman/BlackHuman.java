package com.chenziqiang._2_FactoryPattern.CreateHuman;

/**
 * Created by chenziqiang on 2016/12/17.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑夜给了我黑色的眼睛，");
    }

    @Override
    public void talk() {
        System.out.println("而我却用来寻找光明。");
    }
}
