package com.chenziqiang.FactoryPattern.SimpleFactory;

import com.chenziqiang.FactoryPattern.CreateHuman.Human;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class AbstractHumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("哈哈哈");
        }
        return (T) human;
    }
}
