package com.design.Singleton;

import com.design.Factory.*;

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
