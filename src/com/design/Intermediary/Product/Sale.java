package com.design.Intermediary.Product;

import java.util.Random;

public class Sale extends AbstractColleague
{
    public Sale(AbstractMediator _mediator)
    {
        super(_mediator);
    }

    public void sellIBMComputer(int number)
    {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售" + number + "台");
    }

    public int getSaleStatus()
    {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("销售情况" + saleStatus);
        return saleStatus;
    }

    public void offSale()
    {
        super.mediator.execute("sale.offsell");
    }
}
