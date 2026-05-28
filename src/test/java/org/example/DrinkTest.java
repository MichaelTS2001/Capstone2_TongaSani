package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @Test
    public void smallDrink(){
        Drink small = new Drink(1);
        var price = small.getPrice(1);
        assertEquals(new BigDecimal("2"), price);
    }

    @Test
    public void mediumDrink(){
        Drink small = new Drink(2);
        var price = small.getPrice(2);
        assertEquals(new BigDecimal("2.50"), price);
    }

    @Test
    public void largeDrink(){
        Drink small = new Drink(3);
        var price = small.getPrice(3);
        assertEquals(new BigDecimal("3"), price);
    }

}