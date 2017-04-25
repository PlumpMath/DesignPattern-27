package com.design.Factory;

import com.design.Factory.Pattern.*;

public class Client
{
    public static void main(String[] args)
    {
        Creator creator = new ConcreteCreator();
        Product concreteProduct1 = creator.createProduct(ConcreteProduct1.class);
        concreteProduct1.method1();
        concreteProduct1.method2();

        Product concreteProduct2 = creator.createProduct(ConcreteProduct2.class);
        concreteProduct2.method1();
        concreteProduct2.method2();
    }
}
