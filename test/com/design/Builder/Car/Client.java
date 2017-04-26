package com.design.Builder.Car;

import java.util.ArrayList;

public class Client
{
    public static void main(String[] args)
    {
        Director director = new Director();
        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getCBMWModel().run();
        director.getDBMWModel().run();
    }
}
