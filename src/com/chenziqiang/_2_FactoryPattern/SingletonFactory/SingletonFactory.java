package com.chenziqiang._2_FactoryPattern.SingletonFactory;

import java.lang.reflect.Constructor;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //..
        }
    }
    public static Singleton getSingleton() {
        return singleton;
    }

}
