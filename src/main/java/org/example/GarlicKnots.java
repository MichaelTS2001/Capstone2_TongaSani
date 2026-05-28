package org.example;

import java.math.BigDecimal;

public class GarlicKnots extends MenuItem {
    private BigDecimal price;

    public BigDecimal getPrice() {
        BigDecimal sum = BigDecimal.valueOf(1.50);
        return sum;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
