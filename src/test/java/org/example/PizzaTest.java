package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test
    public void pizzaSizes(){
        Pizza size1 = new Pizza(1, "Thin");
        Toppings topping1 = new Toppings("pepperoni", "meat", true);
        size1.addTopping(topping1);
        var price = size1.getPrice();
        assertEquals(BigDecimal.valueOf(9.50), price);
    }

}