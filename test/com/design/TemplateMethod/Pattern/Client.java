package com.design.TemplateMethod.Pattern;

import com.design.TemplateMethod.Pattern.AbstractClass;
import com.design.TemplateMethod.Pattern.ConcreteClass1;
import com.design.TemplateMethod.Pattern.ConcreteClass2;

public class Client
{
    public static void main(String[] args)
    {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();

        abstractClass1.templateMehtod();
        abstractClass1.templateMehtod();

    }
}
