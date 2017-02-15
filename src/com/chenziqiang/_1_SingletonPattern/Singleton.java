package com.chenziqiang._1_SingletonPattern;

/**
 * Created by chenziqiang on 2016/12/15.
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton() {

    }
    public static Singleton getSingleton() {
        return singleton;
    }
}
