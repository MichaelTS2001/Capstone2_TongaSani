package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ToppingsTest {
    @Test
    public void freeToppingIsZero(){
        Toppings pepperoni = new Toppings("pepperoni", "meat", false);
        var price = pepperoni.getPrice(2);
        assertEquals(BigDecimal.valueOf(2), price);
    }

    @Test
    public void extraMeat(){
        Toppings extra = new Toppings("ham", "extra meat", true);
        var price = extra.getPrice(3);
        assertEquals(BigDecimal.valueOf(1.50), price);
    }

    @Test
    public void cheeseTopping(){
        Toppings cheese = new Toppings("Mozzerella", "Cheese", true);
        var price = cheese.getPrice(1);
        assertEquals(BigDecimal.valueOf(0.75), price);
    }

    @Test
    public void extraCheese(){
        Toppings extraCheese = new Toppings("Buffalo", "Extra Cheese", true);
        var price = extraCheese.getPrice(2);
        assertEquals(BigDecimal.valueOf(0.60), price);
    }

    @Test
    public void meat(){
        Toppings pepperoni = new Toppings("sausage", "meat", true);
        var price = pepperoni.getPrice(3);
        assertEquals(BigDecimal.valueOf(3), price);
    }
}