package com.spartaglobal.em.engineering50;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VendingMachine vendingMachine =  new VendingMachine();
        System.out.println(vendingMachine.buyProduct(100, "Candy"));

    }
}
