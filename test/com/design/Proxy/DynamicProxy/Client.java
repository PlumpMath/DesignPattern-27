package com.design.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
    public static void main(String[] args)
    {
        IGameplayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println("2017-5-27 1:23");
        ClassLoader cl = player.getClass().getClassLoader();
        IGameplayer proxy = (IGameplayer) Proxy.newProxyInstance(cl, new Class[]{IGameplayer.class}, handler);
        proxy.login("zhangsan", "password");
        proxy.KillBoss();
        proxy.upgrade();
        System.out.println("2017-5-27 1:50");
    }
}
