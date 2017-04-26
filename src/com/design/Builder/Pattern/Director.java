package com.design.Builder.Pattern;

public class Director
{
    private Builder builder = new ConcreteProduct();

    public Product getAProduct()
    {
        builder.setPart();
        return builder.buildProduct();
    }
}
