package com.design.Proxy.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;

public class Client
{
    public static void main(String[] args)
    {
        Subject subject = new RealSubject();
        Subject proxy = SujectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finish");
    }
}
