package com.design.Proxy.ForcedProxy;

public interface IGameplayer
{
    public void login(String user, String password);

    public void KillBoss();

    public void upgrade();

    public IGameplayer getProxy();
}
