package org.example;

import java.math.BigDecimal;
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

    public BigDecimal getCartTotal(){
        BigDecimal total = null;
        for(Pizza pizza : cart){
            total =  total.add(pizza.getPrice());
        }

        return total;
    }

    public List<Pizza> getCart(){
        return cart;
    }
}
