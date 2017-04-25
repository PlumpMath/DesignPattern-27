package com.design.Factory.NvWaDemo;

public class HumanFactory extends AbstractHumanFactory
{
    @Override
    public <T extends Human> T creatHuman(Class<T> c)
    {
        Human human = null;
        try
        {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e)
        {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
