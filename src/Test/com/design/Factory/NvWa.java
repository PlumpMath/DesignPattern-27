package com.design.Factory;

import com.design.Factory.NvWaDemo.*;

public class NvWa
{
    public static void main(String[] args)
    {
        AbstractHumanFactory YinYangLu = new HumanFactory();
        Human yellowHuman = YinYangLu.creatHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        YinYangLu.creatHuman(WhiteHuman.class);
        YinYangLu.creatHuman(BlackHuman.class);
    }
}
