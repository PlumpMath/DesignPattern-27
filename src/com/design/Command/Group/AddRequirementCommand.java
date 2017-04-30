package com.design.Command.Group;

public class AddRequirementCommand extends Command
{
    @Override
    public void execute()
    {
        super.rg.find();
        super.rg.add();
        super.pg.add();
        super.cg.add();
        super.rg.plan();
    }
}
