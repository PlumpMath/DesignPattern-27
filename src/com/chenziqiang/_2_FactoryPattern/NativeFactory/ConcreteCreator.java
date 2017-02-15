package com.chenziqiang._2_FactoryPattern.NativeFactory;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T FactoryMethod(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        }catch(Exception e) {
            System.out.println("...");
        }
        return (T) product;
    }
}
