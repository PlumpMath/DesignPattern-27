package com.chenziqiang._2_FactoryPattern.NativeFactory;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.FactoryMethod(ConcreteProduct1.class);
    }
}
