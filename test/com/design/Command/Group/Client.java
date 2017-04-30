package com.design.Command.Group;

public class Client
{
    public static void main(String[] args)
    {
        Invoker xiaoSan = new Invoker();
//        System.out.println("--增加需求--");
//        Command command = new AddRequirementCommand();

        System.out.println("--删除页面--");
        Command command = new DeletePageCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
