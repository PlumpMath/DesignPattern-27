package com.chenziqiang.SingletonPattern;

/**
 * Created by chenziqiang on 2016/12/15.
 */
public class FullSingleton {
    private static FullSingleton singleton = null;
    private FullSingleton() {

    }
    public static FullSingleton getSingleton() {
        if (singleton == null) {
            singleton = new FullSingleton();
        }
        return singleton;
    }
}
