package com.design.Command.Group;

public class CancelDeletePageCommand extends Command
{
    @Override
    public void execute()
    {
        super.pg.rollBack();
    }
}
