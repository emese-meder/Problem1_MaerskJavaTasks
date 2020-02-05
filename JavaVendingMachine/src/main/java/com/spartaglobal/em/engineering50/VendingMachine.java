package com.spartaglobal.em.engineering50;

/*
Problem 1: Vending Machine design in Java
You need to design a Vending Machine which follows the following requirements
Accepts coins of 1,5,10,25, 50 Cents, i.e. penny, nickel, dime, and quarter as well as 1 and 2 dollar note
Allow user to select products e.g. CANDY(10), SNACK(50), NUTS(90), Coke(25), Pepsi(35), Soda(45)
Allow users to take a refund by cancelling the request.
Return the selected product and remaining change if any
Allow reset operation for vending machine supplier
Please write the unit tests for your solution using any of the unit testing framework.
 */

public class VendingMachine {

    public String buyProduct(int paymentInCents, String product){
        Products products = new Products();
        String key = product.toLowerCase();
        int change = paymentInCents - products.getValue(key);
        String output = "Change: " + change + " Product: " + key;
        return output;
    }


}
