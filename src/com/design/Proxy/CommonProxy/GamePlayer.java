package com.design.Proxy.CommonProxy;

public class GamePlayer implements IGameplayer
{
    private String name = "";

    public GamePlayer(IGameplayer _iGameplayer, String _name) throws Exception
    {
        if (_iGameplayer == null)
        {
            throw new Exception("不能创建真是角色");
        } else
        {
            this.name = _name;
        }
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
