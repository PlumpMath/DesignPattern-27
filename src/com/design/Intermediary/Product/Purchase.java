package com.design.Intermediary.Product;

public class Purchase extends AbstractColleague
{
    public Purchase(AbstractMediator _mediator)
    {
        super(_mediator);
    }

    public void buyIBMcomputer(int number)
    {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM()
    {
        System.out.println("不再采购");
    }

}
