package com.design.Proxy.ForcedProxy;

public class GamePlayerProxy implements IGameplayer
{
    private IGameplayer gameplayer = null;

    public GamePlayerProxy(IGameplayer _gameplayer)
    {
        this.gameplayer = _gameplayer;
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

    @Override
    public IGameplayer getProxy()
    {
        return this;
    }
}
