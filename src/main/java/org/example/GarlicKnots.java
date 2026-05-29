package org.example;

import java.math.BigDecimal;

public class GarlicKnots extends MenuItem {
    private BigDecimal price;
    private String name;

    public GarlicKnots() {
        this.name = "Garlic Knots";
    }

    @Override
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        BigDecimal sum = new BigDecimal("1.50");
        return sum;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
