package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ToppingsTest {
    @Test
    public void freeToppingIsZero(){
        Toppings perroni = new Toppings("Peperonii", "meat", false, new BigDecimal("1"));
        var price = perroni.getPrice(2);
        assertEquals(BigDecimal.valueOf(0), price);
    }
}