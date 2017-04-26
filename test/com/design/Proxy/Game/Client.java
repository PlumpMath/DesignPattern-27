package com.design.Proxy.Game;

import com.design.Proxy.Game.GamePlayer;
import com.design.Proxy.Game.GamePlayerProxy;
import com.design.Proxy.Game.IGameplayer;

public class Client
{
    public static void main(String[] args)
    {
        IGameplayer player = new GamePlayer("张三");
        IGameplayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间，2017-4-25");
        proxy.login("zhangsan", "password");
        proxy.KillBoss();
        proxy.upgrade();
        System.out.println("结束时间，2017-4-25");
    }
}
