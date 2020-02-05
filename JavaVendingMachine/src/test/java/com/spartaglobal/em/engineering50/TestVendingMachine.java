package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVendingMachine {
    VendingMachine vendingMachine =new VendingMachine();
    @Test
    public void testAHappyPath(){
        assertEquals("Change: 90 Product: candy" , vendingMachine.buyProduct(100, "Candy"));
    }
}
