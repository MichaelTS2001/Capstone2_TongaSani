package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    @Test
    public void pizzaSizes() {
        Pizza size1 = new Pizza(1, "Thin");
        Toppings topping1 = new Toppings("pepperoni", "meat", true);
        size1.addTopping(topping1);
        var price = size1.getPrice();
        assertEquals(new BigDecimal("9.50"), price);
    }

    @Test
    public void pizzaSizes2() {
        Pizza size2 = new Pizza(2, "Regular");
        Toppings topping2 = new Toppings("Mozzarella", "cheese", true);
        size2.addTopping(topping2);
        var price = size2.getPrice();
        assertEquals(new BigDecimal("13.50"), price);
    }

    @Test
    public void pizzaSizes3() {
        Pizza size3 = new Pizza(3, "Thick");
        Toppings topping3 = new Toppings("Olives", "regular", false);
        size3.addTopping(topping3);
        var price = size3.getPrice();
        assertEquals(new BigDecimal("16.50"), price);
    }

}