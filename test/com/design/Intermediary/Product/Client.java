package com.design.Intermediary.Product;

import com.design.Intermediary.Product.Purchase;
import com.design.Intermediary.Product.Sale;
import com.design.Intermediary.Product.Stock;

public class Client
{
    public static void main(String[] args)
    {
        AbstractMediator mediator = new Mediator();
        System.out.println("--采购电脑--");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        System.out.println("--销售电脑--");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("--库存--");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
