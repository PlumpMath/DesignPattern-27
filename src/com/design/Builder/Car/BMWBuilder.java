package com.design.Builder.Car;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder
{
    BMWModel bmw = new BMWModel();

    @Override
    public CarModel getCarModel()
    {
        return this.bmw;
    }

    @Override
    public void setSequence(ArrayList<String> sequence)
    {
        this.bmw.setSequence(sequence);
    }
}
