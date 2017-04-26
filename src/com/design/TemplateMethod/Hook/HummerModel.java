package com.design.TemplateMethod.Hook;

public abstract class HummerModel
{
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run()
    {
        this.start();
        this.engineBoom();
        if (this.isalarm())
        {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isalarm()
    {
        return true;
    }
}
