package com.chenziqiang.SingletonPattern.MoreSingleton;

/**
 * Created by chenziqiang on 2016/12/16.
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+ (i + 1) + "大臣参拜的是：");
            emperor.say();
        }
    }
}
