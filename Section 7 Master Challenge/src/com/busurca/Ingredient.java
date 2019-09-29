package com.busurca;

import java.math.BigDecimal;

public class Ingredient {

    private String name;
    private BigDecimal price;

    public Ingredient(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }


}
