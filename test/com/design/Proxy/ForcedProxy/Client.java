package com.design.Proxy.ForcedProxy;

public class Client
{
    public static void main(String[] args)
    {
        IGameplayer player = new GamePlayer("张三");
        IGameplayer proxy = player.getProxy();
        System.out.println("开始时间：2017-4-25 17:55");
        proxy.login("zhangsan", "password");
        proxy.KillBoss();
        proxy.upgrade();
        System.out.println("结束时间：2017-4-25 17:59");
    }
}
