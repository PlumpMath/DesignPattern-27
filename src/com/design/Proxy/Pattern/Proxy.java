package com.design.Proxy.Pattern;

public class Proxy implements Subject
{
    private Subject subject = null;

    public Proxy()
    {
        this.subject = new Proxy();
    }

    public Proxy(Object... objects)
    {

    }

    @Override
    public void request()
    {
        this.before();
        this.subject.request();
        this.after();
    }

    private void after()
    {
        // do Something
    }

    private void before()
    {
        //do Something
    }
}
