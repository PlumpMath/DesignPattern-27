package com.design.TemplateMethod.Hook;

public class HummerH1Model extends HummerModel
{
    private boolean alarmFlag = true;

    @Override
    protected void start()
    {

    }

    @Override
    protected void stop()
    {

    }

    @Override
    protected void alarm()
    {

    }

    @Override
    protected void engineBoom()
    {

    }

    protected boolean isAlarm()
    {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm)
    {
        this.alarmFlag = isAlarm;
    }
}
