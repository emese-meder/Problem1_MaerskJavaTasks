package com.spartaglobal.em.engineering50;

import java.util.*;

public class Products {

    private Map<String, Integer> products = new HashMap<>();

    public Products() {
        products.put("candy", 10);
        products.put("snack", 50);
        products.put("nuts", 90);
        products.put("coke", 25);
        products.put("pepsi", 35);
        products.put("soda", 45);

    }

    public Integer getValue(String productName) {
        return products.get(productName);
    }




}
