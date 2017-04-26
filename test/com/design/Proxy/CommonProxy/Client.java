package com.design.Proxy.CommonProxy;

public class Client
{
    public static void main(String[] args)
    {
        IGameplayer proxy = new GamePlayerProxy("张三");
        System.out.println("startTime: 2017-4-26 16:27");
        proxy.login("zhangSan", "password");
        proxy.KillBoss();
        proxy.upgrade();
        System.out.println("stopTime: 2017-4-27 16:29");
    }
}
