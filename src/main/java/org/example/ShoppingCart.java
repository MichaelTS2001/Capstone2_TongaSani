package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public List<Pizza> cart = new ArrayList<>();

    public void addToCart(Pizza pizza){
        cart.add(pizza);
    }

    public void removeFromCart(Pizza pizza){
        cart.remove(pizza);
    }

    public double getCartTotal(){
        double total = 0;
        for(Pizza pizza : cart){
            total += pizza.getPrice();
        }

        return total;
    }

    public List<Pizza> getCart(){
        return cart;
    }
}
