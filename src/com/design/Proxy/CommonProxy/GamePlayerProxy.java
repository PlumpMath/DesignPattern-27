package com.design.Proxy.CommonProxy;

public class GamePlayerProxy implements IGameplayer
{
    private IGameplayer gameplayer = null;

    public GamePlayerProxy(String name)
    {
        try
        {
            gameplayer = new GamePlayer(this, name);
        } catch (Exception e)
        {
        }
    }

    @Override
    public void login(String user, String password)
    {
        this.gameplayer.login(user, password);
    }

    @Override
    public void KillBoss()
    {
        this.gameplayer.KillBoss();
    }

    @Override
    public void upgrade()
    {
        this.gameplayer.upgrade();
    }
}
