package com.design.Proxy.ForcedProxy;

public class GamePlayer implements IGameplayer
{
    private String name = "";
    private IGameplayer proxy = null;

    public GamePlayer(String _name)
    {
        this.name = _name;
    }

    @Override
    public IGameplayer getProxy()
    {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    @Override
    public void login(String user, String password)
    {
        if (this.isProxy())
        {
            System.out.println(user + "---" + this.name);
        }else
        {
            System.out.println("请使用指定的代理方法");
        }
    }

    @Override
    public void KillBoss()
    {
        if (this.isProxy())
        {
            System.out.println(this.name + "Kill Boss");
        } else
        {
            System.out.println("请使用指定的代理方法");
        }
    }

    @Override
    public void upgrade()
    {
        if (this.isProxy())
        {
            System.out.println(this.name + "upgrade");
        }else
        {
            System.out.println("请使用指定的代理方法");
        }
    }

    private boolean isProxy()
    {
        if (this.proxy == null)
        {
            return false;
        } else
        {
            return true;
        }
    }
}
