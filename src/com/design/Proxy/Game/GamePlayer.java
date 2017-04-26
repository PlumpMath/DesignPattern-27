package com.design.Proxy.Game;

public class GamePlayer implements IGameplayer
{
    private String name = "";

    public GamePlayer(String _name)
    {
        this.name = _name;
    }

    @Override
    public void login(String user, String password)
    {
        System.out.println(user + "---" + this.name);
    }

    @Override
    public void KillBoss()
    {
        System.out.println(this.name + "Kill Boss");
    }

    @Override
    public void upgrade()
    {
        System.out.println(this.name + "upgrade");
    }
}
