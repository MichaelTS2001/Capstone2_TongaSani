package org.example;

import java.util.List;

public class ToppingsList {

    public static List<Toppings> getToppings() {
        Toppings[] list = new Toppings[]{
                new Toppings("Pepperoni", "meat", true),
                new Toppings("Sausage", "meat", true),
                new Toppings("Ham", "meat", true),
                new Toppings("Bacon", "meat", true),
                new Toppings("Chicken", "meat", true),
                new Toppings("Meatball", "meat", true),
                new Toppings("Extra Meat", "extra meat", true),
                new Toppings("Mozzarella", "cheese", true),
                new Toppings("Parmesan", "cheese", true),
                new Toppings("Ricotta", "cheese", true),
                new Toppings("Goat Cheese", "cheese", true),
                new Toppings("Buffalo", "cheese", true),
                new Toppings("Extra Cheese", "extra cheese", true),
                new Toppings("Onions", "regular", false),
                new Toppings("Mushrooms", "regular", false),
                new Toppings("Bell Peppers", "regular", false),
                new Toppings("Olives", "regular", false),
                new Toppings("Tomatoes", "regular", false),
                new Toppings("Spinach", "regular", false),
                new Toppings("Basil", "regular", false),
                new Toppings("Pineapple", "regular", false),
                new Toppings("Anchovies", "regular", false),
                new Toppings("Marinara", "sauce", false),
                new Toppings("Alfredo", "sauce", false),
                new Toppings("Pesto", "sauce", false),
                new Toppings("BBQ", "sauce", false),
                new Toppings("Buffalo", "sauce", false),
                new Toppings("Olive Oil", "sauce", false),
                new Toppings("Red Pepper", "side", false),
                new Toppings("Parmesan", "side", false),
        };
        return List.of(list);
    }
}